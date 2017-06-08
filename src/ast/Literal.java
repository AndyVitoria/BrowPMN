package ast;

import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class Literal extends Expr {

    @Override
    public Expr eval(Map<String,Expr> ctx) {
        return this;
    }
    
}
