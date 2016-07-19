package grasp.components.inputlanguage

import grasp.parsers.LparseASPLoader
import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode @AutoClone
class Literal {

    Boolean neg // classic negation
    Atom atom

    ///////////////////////////////////////
    // qualifiers
    ///////////////////////////////////////

    Boolean isGrounded() {
        atom.isGrounded()
    }

    Boolean isAtom() {
        return (!neg)
    }

    Boolean isIdentifier() {
        return (atom.isIdentifier())
    }

    ///////////////////////////////////////
    // operations
    ///////////////////////////////////////

    Literal negate() {
        new Literal(atom: atom, neg: !neg)
    }

    Literal absolute() {
        new Literal(atom: atom, neg: false)
    }

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static Literal build(Atom atom, neg = false) {
        new Literal(atom: atom, neg: neg)
    }

    static Literal build(String functor, List<Parameter> parameters = [], neg = false) {
        new Literal(atom: Atom.build(functor, parameters), neg: neg)
    }

    static Literal parse(String code) {
        LparseASPLoader loader = new LparseASPLoader()
        List<Rule> ruleList = loader.parseString(code+".")

        if (ruleList == null) throw new RuntimeException("parsing of literal not successful")
        if (!ruleList[0].isFact()) throw new RuntimeException("not a fact in input: parsing of '$code' not successful")
        if (ruleList[0].head.inputExtLiterals[0].naf) throw new RuntimeException("not a classic literal in input: parsing of '$code' not successful")
        else return ruleList[0].head.inputExtLiterals[0].literal.clone()
    }

    ///////////////////////////////////////
    // converters
    ///////////////////////////////////////

    Formula toFormula() {
        Formula.build(this)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = atom.toString()
        if (neg) output = "-"+output
        output
    }

}
