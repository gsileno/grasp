package grasp.components.inputlanguage

import groovy.transform.AutoClone
import groovy.transform.EqualsAndHashCode
import groovy.util.logging.Log4j

@Log4j @EqualsAndHashCode
class Literal {

    // classic negation
    Boolean neg

    Atom predicate
    List<Parameter> parameters

    static Literal build(Atom predicate, List<Parameter> parameters = [], neg = false) {
        new Literal(predicate: predicate, parameters: parameters, neg: neg)
    }

    Literal negate() {
        new Literal(predicate: predicate, parameters: parameters, neg: !neg)
    }

    Literal absolute() {
        new Literal(predicate: predicate, parameters: parameters, neg: false)
    }

    Boolean isGrounded() {
        for (parameter in parameters) {
            if (parameter.isVariable())
                return false
        }
        return true
    }

    String toString() {
        String output = predicate.name

        if (neg) output = "-"+output

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
