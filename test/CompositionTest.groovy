import grasp.components.inputlanguage.Formula
import grasp.components.inputlanguage.Operator
import grasp.components.inputlanguage.Program
import grasp.components.inputlanguage.Literal

class CompositionTest extends GroovyTestCase {


    void testUnaryCompositionAND() {

        Literal a = Literal.parse("a")
        Literal b = Literal.parse("b")

        Formula aORb = Formula.buildFromLiterals([a, b], Operator.OR)
        Formula aANDb = Formula.buildFromFormulas([aORb], Operator.AND)

        assert aANDb == aORb
    }

    
}