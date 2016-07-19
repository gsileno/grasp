

import grasp.components.inputlanguage.Program
import grasp.runners.Runner

class RunnerTest extends GroovyTestCase {

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