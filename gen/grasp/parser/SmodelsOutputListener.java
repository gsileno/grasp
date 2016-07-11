// Generated from /home/giovanni/dev/grasp/antlr4/SmodelsOutput.g4 by ANTLR 4.5.3
package grasp.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SmodelsOutputParser}.
 */
public interface SmodelsOutputListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SmodelsOutputParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SmodelsOutputParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void enterStatement_list(SmodelsOutputParser.Statement_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#statement_list}.
	 * @param ctx the parse tree
	 */
	void exitStatement_list(SmodelsOutputParser.Statement_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SmodelsOutputParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SmodelsOutputParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#answerset_list}.
	 * @param ctx the parse tree
	 */
	void enterAnswerset_list(SmodelsOutputParser.Answerset_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#answerset_list}.
	 * @param ctx the parse tree
	 */
	void exitAnswerset_list(SmodelsOutputParser.Answerset_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#answerset}.
	 * @param ctx the parse tree
	 */
	void enterAnswerset(SmodelsOutputParser.AnswersetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#answerset}.
	 * @param ctx the parse tree
	 */
	void exitAnswerset(SmodelsOutputParser.AnswersetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#fact_list}.
	 * @param ctx the parse tree
	 */
	void enterFact_list(SmodelsOutputParser.Fact_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#fact_list}.
	 * @param ctx the parse tree
	 */
	void exitFact_list(SmodelsOutputParser.Fact_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(SmodelsOutputParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(SmodelsOutputParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#pos_literal}.
	 * @param ctx the parse tree
	 */
	void enterPos_literal(SmodelsOutputParser.Pos_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#pos_literal}.
	 * @param ctx the parse tree
	 */
	void exitPos_literal(SmodelsOutputParser.Pos_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void enterList_parameters(SmodelsOutputParser.List_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void exitList_parameters(SmodelsOutputParser.List_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SmodelsOutputParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SmodelsOutputParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SmodelsOutputParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SmodelsOutputParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SmodelsOutputParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(SmodelsOutputParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link SmodelsOutputParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(SmodelsOutputParser.ConstantContext ctx);
}