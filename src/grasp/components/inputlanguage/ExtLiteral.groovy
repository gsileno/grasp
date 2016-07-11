package grasp.components.inputlanguage

import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode @AutoClone
class ExtLiteral {

    // default negation
    Boolean not

    Literal literal

    static ExtLiteral build(Atom atom) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = Literal.build(atom)
        extLiteral.not = false
        extLiteral
    }

    static ExtLiteral build(Literal classicLiteral, Boolean not = false) {
        ExtLiteral extLiteral = new ExtLiteral()
        extLiteral.literal = classicLiteral
        extLiteral.not = not
        extLiteral
    }

    ExtLiteral nullify() {
        build(literal, true)
    }

    ExtLiteral negate() {
        build(literal.negate(), true)
    }

    String toString() {
        String output = literal.toString()
        if (not) output = "not "+output
        output
    }

}
