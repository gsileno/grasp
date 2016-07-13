package grasp.components.inputlanguage

class Term {

    ExtLiteral extLiteral
    Variable variable
    Integer number

    ///////////////////////////////////////
    // builders
    ///////////////////////////////////////

    static build(Atom atom) {
        new Term(
                extLiteral: ExtLiteral.build(atom)
        )
    }

    static build(Literal literal) {
        new Term(
                extLiteral: ExtLiteral.build(literal)
        )
    }

    static build(ExtLiteral extLiteral) {
        new Term(
                extLiteral: extLiteral
        )
    }

    ///////////////////////////////////////
    // views
    ///////////////////////////////////////

    String toString() {
        String output = ""

        if (extLiteral != null) output += extLiteral.toString()
        else if (variable != null) output += variable.toString()
        else if (number != null) output += number

        output
    }
}
