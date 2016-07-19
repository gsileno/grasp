package grasp.runners

import grasp.components.inputlanguage.Program
import grasp.components.inputlanguage.Rule
import grasp.parsers.LparseASPLoader
import groovy.util.logging.Log4j
import grasp.components.outputlanguage.AnswerSet
import grasp.parsers.SmodelsOutputLoader

import java.security.MessageDigest

import groovy.json.JsonOutput
import groovy.json.JsonSlurper

// Logic Programming Runner is a class used as interface with (external) ASP parsers and solvers

@Log4j
class Runner {

    private Boolean cache = false
    private String tmpdir = "./tmp"
    private String filename

    Program program

    GrounderType grounder
    String grounderOutput
    String grounderError

    SolverType solver
    String solverOutput
    String solverError

    List<AnswerSet> answerSetList = []

    // preprocessing to remove style C comments
    void cleanCode() {
        program.code = program.code.replaceAll("(?s)\\s*/\\*.*\\*/", '')
        program.code = program.code.replaceAll("//+", '%')
    }

    void reset() {
        program = null
        grounderOutput = null
        grounderError = null
        solverOutput = null
        solverError = null
        answerSetList = []
    }

    void loadCode(String inputCode) {
        reset()
        program = new Program()
        program.loadCode(inputCode)
        cleanCode()

        // generate temporary directory for files
        def folder = new File(tmpdir + '/')
        if (!folder.exists()) folder.mkdirs()
        filename = tmpdir + "/" + generateMD5(program.code)
    }

    void loadCodeFromFile(String filename) {
        loadCode(new File(filename).text)
    }

    private static String generateMD5(String s) {
        MessageDigest digest = MessageDigest.getInstance("MD5")
        digest.update(s.bytes);
        new BigInteger(1, digest.digest()).toString(16).padLeft(32, '0')
    }

    boolean existsCache(String filename) {
        if (!cache) return false

        File f = new File(filename)
        if (!f.exists()) return false
        return true
    }

    boolean existsCodeCache() {
        return existsCache(filename)
    }

    boolean existsParserCache() {
        return existsCache(filename + ".parser.out")
    }

    boolean existsGrounderCache() {
        return existsCache(filename + ".grounder.out")
    }

    boolean existsSolverCache() {
        return existsCache(filename + ".solver.out")
    }

    boolean existsReaderCache() {
        return existsCache(filename + ".reader.out")
    }

    static void createCache(String filename, String output) {
        File f = new File(filename)
        // if (f.exists()) log.warn("tmp file " + filename + " already existing")
        f.withWriter { out -> out.println(output) }
    }

    void createCodeCache() {
        createCache(filename, program.code)
        log.trace("code saved in the tmp file " + filename)
    }

    void createParserCache(String output) {
        if (!cache) return
        createCache(filename+".parser.out", output)
        log.trace("grounder output saved in the tmp file " + filename + ".grounder.out")
    }

    void createGrounderCache(String output) {
        if (!cache) removeCodeCache()
        createCache(filename+".grounder.out", output)
        log.trace("grounder output saved in the tmp file " + filename + ".grounder.out")
    }

    void createSolverCache(String output) {
        if (!cache) removeGrounderCache()
        createCache(filename+".solver.out", output)
        log.trace("solver output saved in the tmp file " + filename + ".solver.out")
    }

    void createReaderCache(String output) {
        createCache(filename+".reader.out", output)
        log.trace("reader output saved in the tmp file " + filename + ".reader.out")
    }

    String readParserCache() {
        return new File(filename + ".parser.out").text
    }

    String readGrounderCache() {
        return new File(filename + ".grounder.out").text
    }

    String readSolverCache() {
        return new File(filename + ".solver.out").text
    }

    String readReaderCache() {
        return new File(filename + ".reader.out").text
    }

    void removeCodeCache() {
        new File(filename).delete()
        log.trace("cache file " + filename + " removed ")
    }

    void removeParserCache() {
        new File(filename + ".parser.out").delete()
        log.trace("parser output cache file " + filename + " removed ")
    }

    void removeGrounderCache() {
        new File(filename + ".grounder.out").delete()
        log.trace("grounder output cache file " + filename + " removed ")
    }

    void removeSolverCache() {
        new File(filename + ".solver.out").delete()
        log.trace("solver output cache file " + filename + " removed ")
    }

    void removeReaderCache() {
        new File(filename + ".reader.out").delete()
        log.trace("reader output cache file " + filename + " removed ")
    }

    void removeAllCache() {
        removeCodeCache()
        removeGrounderCache()
        removeParserCache()
        removeSolverCache()
        removeReaderCache()
    }

    Boolean parse() {
        if (!existsParserCache()) {
            if (!program.parse())
                return false

            createParserCache(JsonOutput.toJson(program.ruleList))
        } else {
            JsonSlurper slurper = new JsonSlurper()
            def importList = slurper.parseText(readParserCache())
            for (item in importList) {
                program.ruleList.add(item as Rule)
            }
        }

        return true
    }

    Boolean ground() {

        if (!existsGrounderCache()) {

            if (!existsCodeCache()) {
               createCodeCache()
            }

            StringBuffer parserOutBuffer = new StringBuffer(), parserErrBuffer = new StringBuffer()
            def parserProcess = "lparse -W all --true-negation $filename".execute()
            parserProcess.consumeProcessOutput(parserOutBuffer, parserErrBuffer)
            parserProcess.waitFor()

            grounderError = parserErrBuffer.toString()
            grounderOutput = parserOutBuffer.toString()
            if (parserProcess.exitValue() == 0) { // OK
                createGrounderCache(grounderOutput)
            } else {
                log.warn("Error in grounding.. " + grounderError)
                return false
            }

            if (grounderError.length() > 0) {
                log.warn(grounderError)
            }
        } else {
            grounderOutput = readGrounderCache()
        }

        return true
    }

    Boolean solve() {
        if (!ground())
           return false

        if (!existsSolverCache()) {
            StringBuffer solverOutBuffer = new StringBuffer(), solverErrBuffer = new StringBuffer()

            // for problems with the command line and groovy I use a wrapper script around smodels
            def solverProcess = "smodels_wrapper ${filename}.grounder.out".execute()
            solverProcess.consumeProcessOutput(solverOutBuffer, solverErrBuffer)
            solverProcess.waitFor()

            solverError = solverErrBuffer.toString()
            solverOutput = solverOutBuffer.toString()
            if (solverProcess.exitValue() == 0) { //
                createSolverCache(solverOutput)
            } else {
                log.warn("Error in solving.." + solverError)
                return false
            }

            if (solverError.length() > 0) {
                log.warn(solverError)
            }
        } else {
            solverOutput = readSolverCache()
        }

        if (!cache) removeSolverCache()
        return true
    }

    Boolean read() {

        if (!ground())
            return false

        if (!solve())
            return false

        if (!existsReaderCache()) {
            SmodelsOutputLoader loader = new SmodelsOutputLoader()
            answerSetList = loader.parseString(solverOutput).answerSetList
            createReaderCache(JsonOutput.toJson(answerSetList))

        } else {
            JsonSlurper slurper = new JsonSlurper()
            def importList = slurper.parseText(readReaderCache())
            for (item in importList) {
                answerSetList.add(item as AnswerSet)
            }
        }

        if (!cache) removeReaderCache()
        return true
    }

}
