package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode
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
        build(literal.negate(), true)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = literal.toString()
        if (naf) output = "naf "+output
        output
    }

}
