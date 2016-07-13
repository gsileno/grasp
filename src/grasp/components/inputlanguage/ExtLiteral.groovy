package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode
class ExtLiteral {

    Boolean not // default negation
    Literal literal

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static ExtLiteral build(String functor) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = Literal.build(functor)
        extLiteral.not = false
        extLiteral
    }

    static ExtLiteral build(Literal classicLiteral, Boolean not = false) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = classicLiteral
        extLiteral.not = not
        extLiteral
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
        if (not) output = "not "+output
        output
    }

}
