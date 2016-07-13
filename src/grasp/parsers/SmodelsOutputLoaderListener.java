package grasp.parsers;

import grasp.components.inputlanguage.Atom;
import grasp.components.inputlanguage.Literal;
import grasp.components.inputlanguage.Parameter;
import grasp.components.outputlanguage.AnswerSet;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.apache.log4j.Logger;
import grasp.components.outputlanguage.Execution;

import java.util.ArrayList;
import java.util.List;

public class SmodelsOutputLoaderListener extends SmodelsOutputBaseListener {

    private final static Logger log = Logger.getLogger("SmodelsOutputLoaderListener");

    public Execution execution = new Execution();

    public SmodelsOutputLoaderListener() { }

    // Mapping of nodes
    private ParseTreeProperty<Atom> atomNodes = new ParseTreeProperty<Atom>();
    private ParseTreeProperty<Literal> literalNodes = new ParseTreeProperty<Literal>();
    private ParseTreeProperty<List<Parameter>> parameterListNodes = new ParseTreeProperty<List<Parameter>>();
    private ParseTreeProperty<AnswerSet> answerSetNodes = new ParseTreeProperty<AnswerSet>();

    // to enrich the parsing tree with ids to already computed values (atoms, answersets, ...)

    ///////////////// LISTENERS

    public void exitPos_literal(SmodelsOutputParser.Pos_literalContext ctx) {
        Atom atom = Atom.build(ctx.predicate().IDENTIFIER().getText());
        if (ctx.list_parameters() != null) {
            atom.setParameters(parameterListNodes.get(ctx.list_parameters()));
        }
        atomNodes.put(ctx, atom);
    }

    public void exitList_parameters(SmodelsOutputParser.List_parametersContext ctx) {

        Parameter parameter = null;
        List<Parameter> parameterList = new ArrayList<Parameter>();

        if (ctx.identifier() != null) {
            parameter = Parameter.build(Literal.build(Atom.build(ctx.identifier().IDENTIFIER().getText())));
        }
//        else if (ctx.pos_literal() != null) {
//            parameter = Parameter.build(literalNodes.get(ctx.pos_literal()));
//        }
        else if (ctx.constant() != null) {
            parameter = Parameter.build(Integer.parseInt(ctx.constant().INTEGER().getText()));
        } else {
            throw new RuntimeException();
        }

        parameterList.add(parameter);

        if (ctx.list_parameters() != null) {
            parameterList.addAll(parameterListNodes.get(ctx.list_parameters()));
        }

        parameterListNodes.put(ctx, parameterList);
    }

    public void exitLiteral(SmodelsOutputParser.LiteralContext ctx) {

        Atom pos_literal = atomNodes.get(ctx.pos_literal());
        Literal literal = Literal.build(pos_literal);

        if (ctx.MINUS() != null) {
            literal.setNeg(true);
        } else {
            literal.setNeg(false);
        }

        literalNodes.put(ctx, literal);
    }

    public void exitFact_list(SmodelsOutputParser.Fact_listContext ctx) {

        Literal literal = literalNodes.get(ctx.literal());
        AnswerSet answerSet = new AnswerSet();

        answerSet.add(literal);

        if (ctx.fact_list() != null) {
            answerSet.addAll(answerSetNodes.get(ctx.fact_list()));
        }

        answerSetNodes.put(ctx, answerSet);
    }

    public void exitAnswerset(SmodelsOutputParser.AnswersetContext ctx) {
        answerSetNodes.put(ctx, answerSetNodes.get(ctx.fact_list()));
    }

    public void exitAnswerset_list(SmodelsOutputParser.Answerset_listContext ctx) {
        execution.setAnswerSetList(new ArrayList<AnswerSet>());

        for (SmodelsOutputParser.AnswersetContext child: ctx.answerset()) {
            execution.getAnswerSetList().add(answerSetNodes.get(child));
        }
    }

}

