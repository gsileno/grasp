package grasp

import grasp.runners.Runner

class ParserTest extends GroovyTestCase {

    void testParsing() {
        Runner runner = new Runner()
        runner.loadCode("a. a :- b. :- c.")
        assert runner.parse()
        assert runner.ruleList.size() == 3;
        assert runner.ruleList[0].isFact();
        assert runner.ruleList[1].isRule();
        assert runner.ruleList[2].isConstraint();
    }

    void testWrongParsing() {
        Runner runner = new Runner()
        runner.loadCode("!a.")
        assert !runner.parse()
        runner.removeAllCache()
    }

    void testGrounding() {
        Runner runner = new Runner()
        runner.loadCode("a. a :- b.")
        assert runner.ground()
    }

    void testFalseGrounding() {
        Runner runner = new Runner()
        runner.loadCode("!a.")
        assert !runner.ground()
        runner.removeAllCache()
    }

    void testRunning() {
        Runner runner = new Runner()
        runner.loadCode("a. a :- b.")
        assert runner.solve()
    }

    void testReading() {
        Runner runner = new Runner()
        runner.loadCode("a. a :- b.")
        assert runner.read()
    }

}