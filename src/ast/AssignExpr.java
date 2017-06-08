package ast;

import java.util.Map;

/**
 *
 * @author jefferson
 */
public class AssignExpr extends Expr {

    private final String varName;
    private final Expr expr;
    
    public AssignExpr(String varName, Expr expr) {
        this.varName = varName;
        this.expr = expr;
    }

    @Override
    public Expr eval(Map<String,Expr> ctx) {
        Expr val = expr.eval(ctx);
        ctx.put(varName, val);
        return val;
    }
    
    @Override
    public String toString() {
        return String.format("%s = %s", varName, expr);
    }
    
}
