package grasp.components.inputlanguage

import groovy.transform.EqualsAndHashCode

@EqualsAndHashCode
class Atom {
    String name

    static Atom build(String name) {
        new Atom(name: name)
    }

    String toString() { name }
}
