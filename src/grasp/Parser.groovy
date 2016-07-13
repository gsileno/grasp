package grasp

import grasp.components.inputlanguage.Rule
import grasp.parsers.LparseASPLoader

class Parser {

    static List<Rule> parseString(String code) {
       LparseASPLoader loader = new LparseASPLoader()
       loader.parseString(code)
    }

    static List<Rule> parseFile(String filename) {
        LparseASPLoader loader = new LparseASPLoader()
        loader.parseFile(filename)
    }
}
