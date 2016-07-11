package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Variable {
    String name

    static Variable build(String name) {
        new Variable(name: name)
    }

    String toString() { name }

}
