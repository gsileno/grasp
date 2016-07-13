package grasp.parsers;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import grasp.components.outputlanguage.Execution;

import java.io.*;

public class SmodelsOutputLoader {

    public Execution parseString(String text) {

        InputStream is = null;

        try {
            is = new ByteArrayInputStream(text.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return parse(is);
    }

    public Execution parseFile(String filename) throws FileNotFoundException {

        InputStream is = null;

        is = new FileInputStream(filename);

        return parse(is);
    }


    public Execution parse(InputStream is) {

        ANTLRInputStream input = null;

        try {
            input = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        SmodelsOutputLoaderErrorListener errorListener = new SmodelsOutputLoaderErrorListener();

        // Get our lexer
        SmodelsOutputLexer lexer = new SmodelsOutputLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        SmodelsOutputParser parser = new SmodelsOutputParser(tokens);
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        // grounder.setErrorHandler(new LoaderErrorStrategy());
        ParseTree tree = parser.program();

        // create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // create listener then feed to walker
        SmodelsOutputLoaderListener loader = new SmodelsOutputLoaderListener();

        walker.walk(loader, tree); // walk parse tree

        Execution execution = loader.execution; // load the decoration

        execution.setOutputParsingErrors(errorListener.errors); // record the parsing errors

        return execution;
    }
}
