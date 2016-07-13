package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Atom {

    String name
    List<Parameter> parameters

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static Atom build(String name, List<Parameter> parameters = []) {
        new Atom(name: name, parameters: parameters)
    }

    ///////////////////////////////////////
    // converters
    ///////////////////////////////////////

    Literal toLiteral() {
        Literal.build(this)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    Boolean isGrounded() {
        for (parameter in parameters) {
            if (parameter.isVariable())
                return false
        }
        return true
    }

    String toString() {
        String output = name

        if (parameters) {
            output += "("
            for (parameter in parameters) {
                output += parameter.toString() + ", "
            }
            output = output[0..-3]
            output += ")"
        }

        output
    }
}
