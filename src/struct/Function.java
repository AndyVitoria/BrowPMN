package struct;

import org.antlr.v4.runtime.Token;

import java.util.Map;

/**
 * Created by andre on 27/06/17.
 */
public class Function extends Node {
    public String assing;
    public String var1;
    public String var2;


    public Function(String assing, String var1, String var2) {
        this.assing = assing;
        this.var1 = var1;
        this.var2= var2;
    }

    @Override
    public String getName() {
        return assing;
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        return null;
    }
}
