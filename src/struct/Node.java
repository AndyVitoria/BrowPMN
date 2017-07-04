/*
 * Falta implementar o metodo mkParallel e criar os loops
 *
*/

package struct;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public abstract class Node{

    protected String tag;
    private List<Node> next = new ArrayList<Node>();
    private List<String> nextDescription = new ArrayList<String>();
    protected String metadata;
    private String name;

    public String getFluxe(){
        String msg = "";

        for(int i = 0; i < next.size(); i++){
            msg = msg + name + "->" + next.get(i).getName() + " (" +nextDescription.get(i) + ")\n";
        }
        return msg;
    }

    public abstract Node eval(Map<String,Node> ctx);

    public static Node mkAssing(String name, Node node, String tag){
        node.setTag(tag);
        return new AssingNode(name,node, tag);
    }

    // Estabelecimento do fluxo das tarefas do diagrama
    public static Node setNextNode(String previous, String next, String description) {
        // Tags que indicam se é um condicional
        if (next.equals("*") || next.equals("+") || next.equals("@")) {
            if (next.equals("*"))
                next = Exclusive.getTopo() + "_end";
            else if (next.equals("+"))
                next = Parallel.getTopo() + "_end";
            else
                next = Loop.getTopo() + "_end";
        }
        if (previous.equals("*") || previous.equals("+") || previous.equals("@")) {
            if (previous.equals("*"))
                previous = Exclusive.getTopo() + "_start";
            else if (previous.equals("+"))
                previous = Parallel.getTopo() + "_start";
            else
                previous = Loop.getTopo() + "_start";
        }

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

    public static Node mkExclusive(String start, String end, String conditionStart, String conditionEnd){
        return Exclusive.mkExclusive(start, end, conditionStart, conditionEnd);
    }

    public static Node mkParallel(String start, String end, String conditionStart, String conditionEnd){
        return Parallel.mkParallel(start,end,conditionStart,conditionEnd);
    }

    public static Node closeConditional(){
        return Conditional.pullCond();
    }

    public static Node mkLoop(String start, String end, String conditionStart, String conditionEnd){
        return Loop.mkLoop(start,end,conditionStart,conditionEnd);
    }

    // ============{Getters and Setters}============ \\

    public List<Node> getNext() {return next;}

    public void setNext(List<Node> next) {this.next = next;}

    public List<String> getNextDescription() {return nextDescription;}

    public void setNextDescription(List<String> nextDescription) {this.nextDescription = nextDescription;}

    public String getMetadata(){
        if (metadata == null)
            return null;

        String meta = "";
        Node temp;
        String description;
        if (!Objects.equals(tag, "[Loop]"))
        for(int i=0; i<next.size(); i++){
            temp = next.get(i);
            description = nextDescription.get(i);
            // Montando o fluxo do graphViz
            if (description == "")
                meta = meta + getName() + " -> " + temp.getName() + " [label=\"\"];\n";
            else
                meta = meta + getName() + " -> " + temp.getName() + " [label=" + description + "];\n";
        }
        return this.metadata + meta;
    }

    public void setMetadata(String metadata) {this.metadata = metadata;}

    public String getName(){return name;}

    public void setName(String name) {this.name = name;}

    public String getTag(){return tag;}

    public void setTag(String tag){
        this.tag = tag;
    }

    // ============================================= \\
}