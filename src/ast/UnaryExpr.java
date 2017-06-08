/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

/**
 *
 * @author jefferson
 */
public class UnaryExpr extends OperatorExpr {
    
    public UnaryExpr(UnOp op, Expr arg) {
        super(op, arg);
    }

    @Override
    public String toString() {
        return String.format("%s%s", op().toString(), args.get(0).toString());
    }
}
