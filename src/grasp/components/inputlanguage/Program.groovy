package grasp.components.inputlanguage

import grasp.parsers.LparseASPLoader

class Program {
    String code = null
    List<Rule> ruleList = null

    void loadCode(String inputCode) {
        code = inputCode
    }

    void loadCode(File file) {
        code = file.text
    }

    void loadCodeFromFile(String filename) {
        loadCode(new File(filename))
    }

    Boolean parse() {
        if (code == null)
            throw new RuntimeException("Program without code.")

        LparseASPLoader loader = new LparseASPLoader()
        ruleList = loader.parseString(code)

        if (ruleList == null)
            return false

        return true
    }
}
