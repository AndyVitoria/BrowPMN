package ast;

/**
 *
 * @author jefferson
 */
public class BinaryExpr extends OperatorExpr {

    public BinaryExpr(BinOp op, Expr x, Expr y) {
        super(op, x, y);
    }
    
    @Override
    public String toString() {
        return String.format("%s %s %s", 
                args.get(0).toString(), 
                op().toString(), 
                args.get(1).toString());
    }
    
}
