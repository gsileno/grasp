package grasp.components.inputlanguage

import grasp.parsers.LparseASPLoader
import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode @AutoClone
class ExtLiteral {

    Boolean naf // default negation
    Literal literal

    ///////////////////////////////////////
    // qualifiers
    ///////////////////////////////////////

    Boolean isLiteral() {
        return (!naf)
    }

    Boolean isAtom() {
        return (literal.isAtom())
    }

    Boolean isIdentifier() {
        return (literal.isIdentifier())
    }

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static ExtLiteral build(String functor) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = Literal.build(functor)
        extLiteral.naf = false
        extLiteral
    }

    static ExtLiteral build(Literal classicLiteral, Boolean naf = false) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = classicLiteral
        extLiteral.naf = naf
        extLiteral
    }

    static ExtLiteral parse(String code) {
        LparseASPLoader loader = new LparseASPLoader()
        List<Rule> ruleList = loader.parseString(code+".")

        if (ruleList == null) throw new RuntimeException("parsing of extended literal not successful")
        if (!ruleList[0].isFact()) throw new RuntimeException("not a fact in input: parsing of '$code' not successful")
        else return ruleList[0].head.inputExtLiterals[0].clone()
    }

    ///////////////////////////////////////
    // converters
    ///////////////////////////////////////

    Formula toFormula() {
        Formula.build(this)
    }

    ///////////////////////////////////////
    // operations
    ///////////////////////////////////////

    ExtLiteral nullify() {
        build(literal, true)
    }

    ExtLiteral negate() {
        build(literal.negate(), false)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = literal.toString()
        if (naf) output = "naf "+output
        output
    }

    String toASP() {
        String output = literal.toString()
        if (naf) output = "not "+output
        output
    }
}
