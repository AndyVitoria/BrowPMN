package struct;

import java.util.Map;

/**
 * Created by andre on 28/06/17.
 */
public abstract class Type extends Node{
    @Override
    public Node eval(Map<String, Node> ctx) {
        return this;
    }
}
