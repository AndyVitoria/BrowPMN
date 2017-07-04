package struct;

import java.util.Map;

/**
 * Created by andre on 28/06/17.
 */
public class AssingNode extends Node{
    private Node node;

    public AssingNode(String varName, Node node, String tag) {
        setName(varName);
        this.node = node;
        this.node.setName(varName);
        this.setTag(tag);

        switch (tag) {
            case "!":
                setMetadata("start [label=\"\", shape=circle];\n" +
                        varName + " [label=" + node.toString() + ", shape=Square];\n" +
                        "start->" + varName + ";\n");
                break;
            case "#":
                setMetadata("end [label=\"\",shape=circle, style=bold];\n" +
                        varName + " [label=" + node.toString() + ", shape=Square];\n" +
                        varName + "->end;\n");
                break;
            case "->":
                setMetadata("");
                break;
            case "X":
                setMetadata(varName + " [label=\"X\", fontsize=18, shape=diamond];\n");
                break;
            case "+":
                setMetadata(varName + " [label=\"+\", fontsize=18, shape=diamond];\n");
                break;
            case "[Loop]":
                setMetadata("subgraph cluster" + varName + " {\n" +
                        "node [style=filled];\n" +
                        "label = \"[Loop]\";\n" +
                        "color=black\n" +
                        "loop_" + varName + "_start [label=\"\", shape=circle];\n" +
                        "loop_" + varName + "_end [label=\"\", shape=circle]\n" );
                break;
            default:
                setMetadata(varName + " [label=" + node.toString() + ", shape=Square];\n");
                break;
        }
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        Node val = node.eval(ctx);
        ctx.put(getName(), val);
        return val;
    }

    @Override
    public String toString() {
        return String.format(tag + "%s = %s", getName(), node);
    }

}
