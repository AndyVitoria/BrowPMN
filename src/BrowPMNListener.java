// Generated from BrowPMN.g4 by ANTLR 4.5.1

import ast.Expr;
import static ast.Expr.*;
import ast.Op;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BrowPMNParser}.
 */
public interface BrowPMNListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(BrowPMNParser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(BrowPMNParser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#sttm}.
	 * @param ctx the parse tree
	 */
	void enterSttm(BrowPMNParser.SttmContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#sttm}.
	 * @param ctx the parse tree
	 */
	void exitSttm(BrowPMNParser.SttmContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#assign}.
	 * @param ctx the parse tree
	 */
	void enterAssign(BrowPMNParser.AssignContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#assign}.
	 * @param ctx the parse tree
	 */
	void exitAssign(BrowPMNParser.AssignContext ctx);
	/**
	 * Enter a parse tree produced by {@link BrowPMNParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BrowPMNParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BrowPMNParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BrowPMNParser.ExprContext ctx);
}