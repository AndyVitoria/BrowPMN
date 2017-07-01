package struct;

import java.util.Map;

/**
 * Created by andre on 28/06/17.
 */
public class AssingNode extends Node{
    private Node node;

    public AssingNode(String varName, Node node, String tag) {
        this.name = varName;
        this.node = node;
        this.node.name = varName;
        this.tag = tag;

        switch (tag) {
            case "!":
                metadata = "start [label=\"\", shape=circle];\n" +
                        varName + " [label=" + node.toString() + ", shape=Square];\n" +
                        "start->" + varName + ";\n";
                break;
            case "#":
                metadata = "end [label=\"\",shape=circle, style=bold];\n" +
                        varName + " [label=" + node.toString() + ", shape=Square];\n" +
                        varName + "->end;\n";
                break;
            case "->":
                metadata = "";
                break;
            default:
                metadata = varName + " [label=" + node.toString() + ", shape=Square];\n";
                break;
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        Node val = node.eval(ctx);
        ctx.put(name, val);
        return val;
    }

    @Override
    public String toString() {
        return String.format(tag + "%s = %s", name, node);
    }

}
