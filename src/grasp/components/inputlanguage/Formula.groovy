package grasp.components.inputlanguage

import groovy.transform.AutoClone

@AutoClone
class Formula {

    List<Formula> inputFormulas = [] // sub-formulas in input
    Operator operator                // last operator
    List<Term> inputTerms = []       // relevant, dependent factors

    ///////////////////////////////////////
    // operations
    ///////////////////////////////////////

    List<Literal> getGroundLiterals(List<Literal> groundLiterals = []) {

        for (term in inputTerms) {
            if (term.number != null)
                throw new RuntimeException();
            else if (term.variable != null)
                throw new RuntimeException();
            else if (term.extLiteral.not)
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
            else if (op == Operator.NOT)
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

        // if reduction has to be applied
        if (input.inputTerms.size() > 0) {
            return buildFromTerms(input.inputTerms, op)
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

        if (terms.size() > 1) {
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

}
