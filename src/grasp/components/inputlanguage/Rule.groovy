package grasp.components.inputlanguage

public class Rule {
    Formula head
    Formula body

    ///////////////////////////////////////
    // qualifiers
    ///////////////////////////////////////

    boolean isFact() {
        return body == null && head != null;
    }

    boolean isConstraint() {
        return body != null && head == null;
    }

    boolean isRule() {
        return body != null && head != null;
    }

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static Rule build(Formula head, Formula body) {
        return new Rule(head: head, body: body)
    }

    static Rule build(Literal conclusion, Formula body) {
        Formula head = Formula.build(conclusion);
        return new Rule(head: head, body: body)
    }

    static Rule build(Literal conclusion, List<Literal> premises) {
        Formula head = Formula.build(conclusion);
        Formula body = Formula.buildFromLiterals(premises, Operator.AND);
        return new Rule(head: head, body: body)
    }

    static Rule build(List<Literal> conclusions, List<Literal> premises) {
        Formula head = Formula.buildFromLiterals(conclusions, Operator.AND);
        Formula body = Formula.buildFromLiterals(premises, Operator.AND);
        return new Rule(head: head, body: body)
    }

    ///////////////////////////////////////
    // converters
    ///////////////////////////////////////

    Formula toFormula() {
        Formula.build(body, head, Operator.IF)
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

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