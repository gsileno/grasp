// Generated from /home/giovanni/dev/grasp/antlr4/LparseASP.g4 by ANTLR 4.5.3
package grasp.parsers;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link LparseASPParser}.
 */
public interface LparseASPListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(LparseASPParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(LparseASPParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(LparseASPParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(LparseASPParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#asprule}.
	 * @param ctx the parse tree
	 */
	void enterAsprule(LparseASPParser.AspruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#asprule}.
	 * @param ctx the parse tree
	 */
	void exitAsprule(LparseASPParser.AspruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#aspfact}.
	 * @param ctx the parse tree
	 */
	void enterAspfact(LparseASPParser.AspfactContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#aspfact}.
	 * @param ctx the parse tree
	 */
	void exitAspfact(LparseASPParser.AspfactContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#range}.
	 * @param ctx the parse tree
	 */
	void enterRange(LparseASPParser.RangeContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#range}.
	 * @param ctx the parse tree
	 */
	void exitRange(LparseASPParser.RangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#normrule}.
	 * @param ctx the parse tree
	 */
	void enterNormrule(LparseASPParser.NormruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#normrule}.
	 * @param ctx the parse tree
	 */
	void exitNormrule(LparseASPParser.NormruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#constraint}.
	 * @param ctx the parse tree
	 */
	void enterConstraint(LparseASPParser.ConstraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#constraint}.
	 * @param ctx the parse tree
	 */
	void exitConstraint(LparseASPParser.ConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#choice}.
	 * @param ctx the parse tree
	 */
	void enterChoice(LparseASPParser.ChoiceContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#choice}.
	 * @param ctx the parse tree
	 */
	void exitChoice(LparseASPParser.ChoiceContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#head}.
	 * @param ctx the parse tree
	 */
	void enterHead(LparseASPParser.HeadContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#head}.
	 * @param ctx the parse tree
	 */
	void exitHead(LparseASPParser.HeadContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(LparseASPParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(LparseASPParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#list_literals}.
	 * @param ctx the parse tree
	 */
	void enterList_literals(LparseASPParser.List_literalsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#list_literals}.
	 * @param ctx the parse tree
	 */
	void exitList_literals(LparseASPParser.List_literalsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#list_ext_literals_expressions}.
	 * @param ctx the parse tree
	 */
	void enterList_ext_literals_expressions(LparseASPParser.List_ext_literals_expressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#list_ext_literals_expressions}.
	 * @param ctx the parse tree
	 */
	void exitList_ext_literals_expressions(LparseASPParser.List_ext_literals_expressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(LparseASPParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(LparseASPParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void enterNum_expression(LparseASPParser.Num_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#num_expression}.
	 * @param ctx the parse tree
	 */
	void exitNum_expression(LparseASPParser.Num_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#ext_literal}.
	 * @param ctx the parse tree
	 */
	void enterExt_literal(LparseASPParser.Ext_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#ext_literal}.
	 * @param ctx the parse tree
	 */
	void exitExt_literal(LparseASPParser.Ext_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(LparseASPParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(LparseASPParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#pos_literal}.
	 * @param ctx the parse tree
	 */
	void enterPos_literal(LparseASPParser.Pos_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#pos_literal}.
	 * @param ctx the parse tree
	 */
	void exitPos_literal(LparseASPParser.Pos_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void enterList_parameters(LparseASPParser.List_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#list_parameters}.
	 * @param ctx the parse tree
	 */
	void exitList_parameters(LparseASPParser.List_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(LparseASPParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(LparseASPParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(LparseASPParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(LparseASPParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(LparseASPParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(LparseASPParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link LparseASPParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(LparseASPParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link LparseASPParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(LparseASPParser.VariableContext ctx);
}