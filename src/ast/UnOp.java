package ast;

import java.util.List;
import java.util.Map;
import java.util.function.UnaryOperator;

/**
 *
 * @author jefferson
 */
public class UnOp extends Operator {

    private final UnaryOperator<Expr> opFunc;
    
    public UnOp(String opName, UnaryOperator<Expr> opFunc) {
        super(opName);
        this.opFunc = opFunc;
    }

    @Override
    public Expr apply(Map<String,Expr> ctx, List<Expr> args) {
        int n = args.size();
        if (n != 1) {
            String msg = String.format("Wrong number of arguments. Expected: %d; found: %d.", 1, n);
            throw new IllegalArgumentException(msg);
        }
        Expr x = args.get(0).eval(ctx);
        return opFunc.apply(x);
    }
    
}
