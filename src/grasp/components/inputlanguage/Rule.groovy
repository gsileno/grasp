package grasp.components.inputlanguage

public class Rule {
    Formula head
    Formula body

    boolean isFact() {
        return body == null && head != null;
    }

    boolean isConstraint() {
        return body != null && head == null;
    }

    boolean isRule() {
        return body != null && head != null;
    }

    String toString() {
        String output = ""

        if (head != null)
            output += head.toString()
        if (body != null) {
            output += " :- "
            output += body.toString()
        }

        output
    }
}