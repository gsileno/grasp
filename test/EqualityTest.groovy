import grasp.components.inputlanguage.Literal
import grasp.components.inputlanguage.ExtLiteral
import grasp.components.inputlanguage.Formula
import grasp.components.inputlanguage.Operator

class EqualityTest extends GroovyTestCase {

    void testEqualities() {
        Literal a1 = Literal.parse("a")
        Literal a2 = Literal.parse("a")
        Literal na1 = Literal.parse("-a")
        Literal na2 = ExtLiteral.parse("-a").literal

        assert a1 == a2
        assert a1 != na1
        assert na1 == na2
    }

    void testFormulaSort() {
        Literal a = Literal.parse("a")
        Literal b = Literal.parse("b")
        Formula f1 = Formula.build(Formula.build(a), Formula.build(b), Operator.AND)
        Formula f1b = Formula.build(Formula.build(a), Formula.build(b), Operator.AND)
        Formula f2 = Formula.build(Formula.build(b), Formula.build(a), Operator.AND)

        assert f1 == f1b
        assert f1 != f2

        println "before sorting "+f2

        f2 = f2.sort()

        println "after sorting "+f2

        assert f1 == f2

    }

}