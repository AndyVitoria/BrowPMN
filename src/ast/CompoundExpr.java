package ast;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class CompoundExpr extends Expr {
    
    protected final Applicable fn;

    protected final List<Expr> args = new LinkedList<>();
    
    protected CompoundExpr(Applicable fn, Expr... args) {
        this.fn = fn;
        this.args.addAll(Arrays.asList(args));
    }
    
    protected CompoundExpr(Applicable fn, List<Expr> args) {
        this.fn = fn;
        this.args.addAll(args);
    }
    
    @Override
    public Expr eval(Map<String,Expr> ctx) {
        return fn.apply(ctx, args);
    }
    
}
