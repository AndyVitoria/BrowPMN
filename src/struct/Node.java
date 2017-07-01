package struct;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Node{
    private static final int IF = 0;
    protected String tag;
    public List<Node> next = new ArrayList<Node>();
    public List<String> nextDescription = new ArrayList<String>();
    public String graph;
    String metadata;
    String data;
    public String name;

    public String getMetadata(){
        if (metadata == null)
            return null;

        String meta = "";
        Node temp;
        String description;
        for(int i=0; i<next.size(); i++){
            temp = next.get(i);
            description = nextDescription.get(i);
            if (description == "")
                meta = meta + getName() + " -> " + temp.getName() + " [label=\"\"];\n";
            else
                meta = meta + getName() + " -> " + temp.getName() + " [label=" + description + "];\n";
        }

        return this.metadata + meta;
    }

    public void setTag(String tag){
        this.tag = tag;
    }

    public String getTag(){return tag;}

    public String getFluxe(){
        String msg = "";

        for(int i = 0; i < next.size(); i++){
            msg = msg + name + "->" + next.get(i).getName() + " (" +nextDescription.get(i) + ")\n";
        }
        return msg;
    }

    public String getName(){return name;}

    public abstract Node eval(Map<String,Node> ctx);

    public static Node mkAssing(String name, Node node, String tag){
        node.setTag(tag);
        return new AssingNode(name,node, tag);
    }

    public static Node setNextNode(String previous, String next, String description) {
        Node tempNode = new AssingNode(previous, new Str(previous), "->");
        tempNode.next.add(new AssingNode(next, new Str(next), "->"));
        tempNode.nextDescription.add(description);
        return tempNode;
    }

    public String getInfo(){
        return next(getName());
    }

    protected String next(String name) {
        String msg = getName() + '{';
        if (tag != null)
            msg = tag + msg;

        for(int i = 0; i < next.size(); i++){
            msg = msg + name + "->" + next.get(i).getName() + " (" +nextDescription.get(i) + ")\n";
        }
        return msg + '}';
    }

    /*public Node mkExclusive(String var1, String var2, String condition, String transition){
        Node exclusive = mkAssing("if_" + String.valueOf(this.IF), new AssingNode(var1, new Str(var1), "->"), "");
        setNextNode(exclusive.name, var1, condition)
    }*/
}