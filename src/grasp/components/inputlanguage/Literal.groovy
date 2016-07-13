package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode
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

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = atom.toString()
        if (neg) output = "-"+output
        output
    }

}
