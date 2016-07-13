package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Variable {

    String name

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static Variable build(String name) {
        new Variable(name: name)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() { name }

}
