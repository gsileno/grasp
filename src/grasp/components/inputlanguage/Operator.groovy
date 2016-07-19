package grasp.components.inputlanguage

enum Operator {
    POS, NEG, NAF,
    AND, OR, XOR,
    IF, CHOICE

    Boolean unary() {
        (this == POS || this == NEG || this == NAF)
    }
}
