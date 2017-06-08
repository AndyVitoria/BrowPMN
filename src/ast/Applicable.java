/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.List;
import java.util.Map;

/**
 *
 * @author jefferson
 */
public abstract class Applicable {
    public abstract Expr apply(Map<String,Expr> ctx, List<Expr> args);
}
