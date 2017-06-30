package struct;

import org.antlr.v4.runtime.Token;

import java.util.Map;

/**
 * Created by andre on 27/06/17.
 */
public class Variable extends Node{

    public Variable(String name) {
        this.name=name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Node eval(Map<String,Node> ctx) {
        Node val = ctx.get(name);
        if (val == null) {
            throw new RuntimeException("Undefined variable: " + name);
        }else{
            return val;
        }
    }
}
