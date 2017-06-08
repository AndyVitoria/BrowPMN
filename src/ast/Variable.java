package ast;

import java.security.KeyException;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public class Variable extends Expr {

    private final String name;
    
    public Variable(String name) {
        this.name = name;
    }

    @Override
    public Expr eval(Map<String,Expr> ctx) {
        Expr val = ctx.get(name);
        if (val == null) {
            throw new RuntimeException("Undefined variable: " + name);
        }
        else return val;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
