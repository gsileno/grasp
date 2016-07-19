package grasp

import grasp.components.inputlanguage.Program

class ParserTest extends GroovyTestCase {

    void testParsing() {
        Program program = new Program()
        program.loadCode("a. a :- b. :- c.")
        assert program.parse()
        assert program.ruleList.size() == 3;
        assert program.ruleList[0].isFact();
        assert program.ruleList[1].isRule();
        assert program.ruleList[2].isConstraint();
    }

    void testWrongParsing() {
        Program program = new Program()
        program.loadCode("!a.")
        assert !program.parse()
    }

    void testNegativeAtom() {
        Program program = new Program()
        program.loadCode("b :- -a.")
        assert program.parse()
        assert program.ruleList[0].body.inputLiterals[0].atom.name == "a"
        assert program.ruleList[0].body.inputLiterals[0].neg
    }

    void testNullAtom() {
        Program program = new Program()
        program.loadCode("b :- naf a.")
        assert program.parse()
        assert program.ruleList[0].body.inputExtLiterals[0].literal.atom.name == "a"
        assert program.ruleList[0].body.inputExtLiterals[0].naf
    }

}