package struct;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Node{
    protected String tag;
    private List<Node> next = new ArrayList<Node>();
    private List<String> nextDescription = new ArrayList<String>();
    public String graph;
    String metadata;
    String data;
    public String name;

    public String getMetadata(){
        if (metadata == null)
            return null;

        String meta = "";
        Node temp;
        String str;
        for(int i=0; i<next.size(); i++){
            temp = next.get(i);
            meta = meta + getName() + " -> " + temp.getName() + " [label=\"" + nextDescription.get(i) + "\"];\n";
        }

        return this.metadata + meta;
    }


    public void setTag(String tag){
        this.tag = tag;
    }

    public String getTag(){return tag;}

    public String getName(){return name;}

    public abstract Node eval(Map<String,Node> ctx);

    public static Node mkVariable(String name){
        return new Variable(name);
    }

    public static Node mkAssing(String name, Node node, String tag){
        node.setTag(tag);
        return new AssingNode(name,node, tag);
    }

    public Node setNextNode(Node result, String str) {
        this.next.add(result);
        this.nextDescription.add(str);
        return this;
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
}