package grasp.components.inputlanguage

enum Operator {
    POS, NEG, NOT,
    AND, OR, XOR,
    IF, CHOICE

    Boolean unary() {
        (this == POS || this == NEG || this == NOT)
    }
}
