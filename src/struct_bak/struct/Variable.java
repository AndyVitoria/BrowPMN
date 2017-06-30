package struct_bak.struct;

import java.util.Map;

/**
 * Created by andre on 27/06/17.
 */
public class Variable extends Node {
    private String assing;
    public Variable(String assing, String data) {
        super(assing, data);
        this.assing=assing;
    }

    @Override
    public Node eval(Map<String,Node> ctx) {
        Node val = ctx.get(assing);
        if (val == null) {
            throw new RuntimeException("Undefined variable: " + assing);
        }
        else return val;
    }

}
