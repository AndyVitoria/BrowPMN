package ast;

import java.util.List;

/**
 *
 * @author jefferson
 */
public class OperatorExpr extends CompoundExpr {
    
    protected OperatorExpr(Operator op, List<Expr> args) {
        super(op, args);
    }
    
    protected OperatorExpr(Operator op, Expr... args) {
        super(op, args);
    }
    
    public Operator op() {
        return (Operator)fn;
    }
    
}
