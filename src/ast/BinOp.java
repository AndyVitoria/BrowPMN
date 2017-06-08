/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;

/**
 *
 * @author jefferson
 */
public class BinOp extends Operator {

    private final BinaryOperator<Expr> opFunc;
    
    public BinOp(String opName, BinaryOperator<Expr> opFunc) {
        super(opName);
        this.opFunc = opFunc;
    }

    @Override
    public Expr apply(Map<String,Expr> ctx, List<Expr> args) {
        int n = args.size();
        if (n != 2) {
            String msg = String.format("Wrong number of arguments. Expected: %d; found: %d.", 2, n);
            throw new IllegalArgumentException(msg);
        }
        Expr x = args.get(0).eval(ctx);
        Expr y = args.get(1).eval(ctx);
        return opFunc.apply(x, y);
    }
    
}
