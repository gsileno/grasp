package grasp.parsers;

import grasp.components.inputlanguage.Rule;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.DiagnosticErrorListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.*;
import java.util.List;

public class LparseASPLoader {

    public static List<Rule> parseString(String text) {

        InputStream is = null;

        try {
            is = new ByteArrayInputStream(text.getBytes("UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return parse(is);
    }

    public static List<Rule> parseFile(String filename) throws FileNotFoundException {

        InputStream is = null;

        is = new FileInputStream(filename);

        return parse(is);
    }

    private static List<Rule> parse(InputStream is) {

        ANTLRInputStream input = null;

        try {
            input = new ANTLRInputStream(is);
        } catch (IOException e) {
            e.printStackTrace();
        }

        LparseASPLoaderErrorListener errorListener = new LparseASPLoaderErrorListener();

        // Get our lexer
        LparseASPLexer lexer = new LparseASPLexer(input);
        lexer.removeErrorListeners();
        lexer.addErrorListener(errorListener);

        // Get a list of matched tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        LparseASPParser parser = new LparseASPParser(tokens);

        //** TO LET ANTLR GIVES FEEDBACK ON THE GRAMMAR **//
        parser.removeErrorListeners();
        parser.addErrorListener(errorListener);

        ParseTree tree = parser.program();

        // create a standard ANTLR parse tree walker
        ParseTreeWalker walker = new ParseTreeWalker();
        // create listener then feed to walker
        LparseASPLoaderListener loader = new LparseASPLoaderListener();

        walker.walk(loader, tree); // walk parse tree

        if (errorListener.errors.size() > 0)
            return null;
        else
            return loader.ruleList;
    }
}
