package grasp.components.inputlanguage

import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
@AutoClone
class Formula {

    List<Formula> inputFormulas = [] // sub-formulas in input
    Operator operator                // last operator
    List<Term> inputTerms = []       // relevant, dependent factors

    ///////////////////////////////////////
    // operations
    ///////////////////////////////////////

    static List<Formula> sortFormulaList(List<Formula> inputFormulas) {
        Formula temp
        for (int i = 0; i < inputFormulas.size(); i++) {
            for (int j = i; j > 0; j--) {
                if (inputFormulas[j].toString() < inputFormulas[j - 1].toString()) {
                    temp = inputFormulas[j];
                    inputFormulas[j] = inputFormulas[j - 1];
                    inputFormulas[j - 1] = temp;
                }
            }
        }
        inputFormulas
    }

    // TODO: based on string, really not good
    Formula sort() {
        Formula sorted = this.clone()
        if (operator == Operator.AND || operator == Operator.OR || operator == Operator.CHOICE || operator != Operator.XOR) {

            if (sorted.inputTerms.size() > 0) {
                Term temp
                for (int i = 0; i < sorted.inputTerms.size(); i++) {
                    for (int j = i; j > 0; j--) {
                        if (sorted.inputTerms[j].toString().replaceAll('-', '') < sorted.inputTerms[j - 1].toString().replaceAll('-', '')) {
                            // TODO add naf
                            temp = sorted.inputTerms[j];
                            sorted.inputTerms[j] = sorted.inputTerms[j - 1];
                            sorted.inputTerms[j - 1] = temp;
                        }
                    }
                }
            }

            if (sorted.inputFormulas.size() > 0) {
                Formula temp
                for (int i = 0; i < sorted.inputFormulas.size(); i++) {
                    for (int j = i; j > 0; j--) {
                        if (sorted.inputFormulas[j].toString().replaceAll('-', '') < sorted.inputFormulas[j - 1].toString().replaceAll('-', '')) {
                            // TODO add naf
                            temp = sorted.inputFormulas[j];
                            sorted.inputFormulas[j] = sorted.inputFormulas[j - 1];
                            sorted.inputFormulas[j - 1] = temp;
                        }
                    }
                }
            }
        }

        sorted
    }

    List<ExtLiteral> getInputExtLiterals() {
        List<ExtLiteral> inputExtLiterals = []
        for (term in inputTerms) {
            if (!term.isExtLiteral())
                throw new RuntimeException("I was expecting only extended literal terms here: " + this);
            else {
                inputExtLiterals << term.getExtLiteral()
            }
        }
        inputExtLiterals
    }

    List<Literal> getInputLiterals() {
        List<Literal> inputLiterals = []
        for (term in inputTerms) {
            if (!term.isLiteral())
                throw new RuntimeException("I was expecting only literal terms here: " + this);
            else {
                inputLiterals << term.getLiteral()
            }
        }
        inputLiterals
    }

    List<Literal> getGroundLiterals(List<Literal> groundLiterals = []) {

        for (term in inputTerms) {
            if (term.number != null)
                throw new RuntimeException();
            else if (term.variable != null)
                throw new RuntimeException();
            else if (term.extLiteral.naf)
                throw new RuntimeException();
            else if (!term.extLiteral.literal.isGrounded())
                throw new RuntimeException();
            else {
                groundLiterals << term.extLiteral.literal
            }
        }

        groundLiterals
    }

    Formula negate() {
        if (inputFormulas.size() == 0) { // negation of a literal
            return build(inputTerms.get(0).negate())
        } else if (operator == Operator.NEG) { // negation of a formula // double negation
            if (inputFormulas.size() > 1) throw new RuntimeException("Expected a unary operation here")
            return inputFormulas.get(0).clone()
        } else
            return build(this, Operator.NEG)
    }

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static Formula build(Atom atom) {
        new Formula(
                operator: Operator.POS,
                inputTerms: [Term.build(Literal.build(atom))]
        )
    }

    static Formula build(Literal literal) {
        new Formula(
                operator: Operator.POS,
                inputTerms: [Term.build(literal)]
        )
    }

    static Formula build(ExtLiteral extLiteral) {
        new Formula(
                operator: Operator.POS,
                inputTerms: [Term.build(extLiteral)]
        )
    }

    static Formula build(Term term) {
        new Formula(
                operator: Operator.POS,
                inputTerms: [term]
        )
    }

    static Formula buildFromLiterals(List<Literal> literals, Operator op) {

        Formula formula = new Formula()

        if (literals.size() > 1) {
            formula.operator = op

            for (literal in literals) {
                Formula f = build(literal)
                formula.inputFormulas << f
                formula.inputTerms << Term.build(literal)
            }
        } else { // with only one input, the formula becomes identity, unless it is negation
            if (op == Operator.NEG)
                formula = build(Term.build(literals[0].negate()))
            else
                formula = build(literals[0])
        }

        formula
    }

    static Formula buildFromTerms(List<Term> terms, Operator op) {
        Formula formula = new Formula()

        if (terms.size() > 1) {
            formula.operator = op

            for (term in terms) {
                Formula f = build(term)
                formula.inputFormulas << f
                formula.inputTerms << term
            }
        } else { // with only one input, the formula becomes identity, unless it is negation
            if (op == Operator.NEG)
                formula = build(Term.build(terms[0].extLiteral.negate()))
            else if (op == Operator.NAF)
                formula = build(Term.build(terms[0].extLiteral.nullify()))
            else
                formula = build(terms[0])
        }

        formula
    }

    // build a formula from string versions of the terms (eg 010, 1X0), given a dictionary of atoms (eg. [a, b, c]
    // the result is e.g. (-a and b and -c)
    static Formula buildFromStringGroundLiterals(String stringValue, List<Literal> groundLiterals) {

        if (stringValue.length() != groundLiterals.size()) {
            throw new RuntimeException()
        }

        List<Literal> conditions = []
        for (Integer i = 0; i < stringValue.length(); i++) {
            if (stringValue[i] == '0') {
                conditions << groundLiterals[i].negate()
            } else if (stringValue[i] == '1') {
                conditions << groundLiterals[i]
            } else if (stringValue[i] == 'X') {
                // else "X" don't do anything
            } else {
                throw new RuntimeException()
            }
        }

        buildFromLiterals(conditions, Operator.AND)
    }

    // unary formula
    static Formula build(Formula input, Operator op) {

        if (op == Operator.AND || op == Operator.OR) {     // SIMPLIFICATION
            return input.clone()
        } else {
            return new Formula(
                    operator: op,
                    inputFormulas: [input],
                    inputTerms: input.inputTerms
            )
        }
    }

    // binary formula
    static Formula build(Formula leftInput, Formula rightInput, Operator op) {
        buildFromFormulas([leftInput, rightInput], op)
    }

    // n-ary formula
    static Formula buildFromFormulas(List<Formula> inputs, Operator op) {

        // aggregate all terms of the inputs
        List<Term> terms = []

        Formula formula = new Formula()

        if (inputs.size() > 1) {
            inputs.each() {
                terms = terms - it.inputTerms + it.inputTerms
            }

            formula.operator = op
            formula.inputFormulas = inputs
            formula.inputTerms = terms
        } else {
            formula = build(inputs[0], op)
        }

        formula
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = ""

        Boolean printOp = (operator != Operator.POS)

        if (printOp) output += operator.toString() + "("

        if (inputFormulas.size() > 0) {
            for (formula in inputFormulas)
                output += formula.toString() + ", "
            output = output[0..-3]
        } else {
            for (term in inputTerms) {
                output += term.toString() + ", "
            }
            output = output[0..-3]
        }

        if (printOp) output += ")"

        output
    }

    String toASP(Boolean head = false) {
        String output = ""

        Integer n = inputFormulas.size()

        switch (operator) {
            case Operator.POS:
                if (n > 1) return "// POS there should be only an atom"
                break
            case Operator.AND:
                if (head) output += n + "{"
                break
            case Operator.OR:
                output += "1{"
                break
            case Operator.CHOICE:
                // TODO: choice parameters to be implemented
                output += "{"
                break
            case Operator.NEG:
                if (n > 1) return "// NEG: there should be only an atom"
                output += "-"
                break
            case Operator.IF:
                return "// ASP does naf allow for internal implications"
                break
            case Operator.XOR:
                output += "1{"
                break
            default:
                throw new RuntimeException("Not yet implemented")
        }

        if (inputFormulas.size() > 0) {
            for (formula in inputFormulas)
                output += formula.toASP()+', '
            output = output[0..-3]
        } else {
            if (inputTerms.size() > 1)
                throw new RuntimeException("In this atomic formula there are more atoms !?!")

            output += inputTerms[0].toASP()
        }

        switch (operator) {
            case Operator.POS:
                break
            case Operator.AND:
                if (head) output += "}" + n
                break
            case Operator.OR:
                output += "}"
                break
            case Operator.CHOICE:
                output += "}" + n
                // TODO: choice parameters to be implemented
                break
            case Operator.NEG:
                break
            case Operator.XOR:
                output += "}1"
                break
            default:
                throw new RuntimeException("Not yet implemented")
        }

        output
    }

}
