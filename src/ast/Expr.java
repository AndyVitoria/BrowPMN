package ast;

import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class Expr {

    public abstract Expr eval(Map<String,Expr> ctx);

    public static Expr mkExpr(UnOp op, Expr x) {
        return new UnaryExpr(op, x);
    }
    
    public static Expr mkExpr(BinOp op, Expr x, Expr y) {
        return new BinaryExpr(op, x, y);
    }
    
    public static Expr mkAssign(String varName, Expr expr) {
        return new AssignExpr(varName, expr);
    }
    
    public static Expr mkVar(String varName) {
        return new Variable(varName);
    }

    public static Expr mkString(String str) {return new Stringer(str);}
}
