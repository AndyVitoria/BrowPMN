package struct_bak.struct;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public abstract class Node{
    private int ID;
    private String assing;
    private String data;
    private List<Node> next = new ArrayList<Node>();
    private String metadata;

    Node(String assing, String data){
        this.assing = assing;
        this.data = data;
    }


    public abstract Node eval(Map<String, Node> ctx);

    public static Node mkVariable(String assing, String data){
        return new Variable(assing, data);
    }

    public static Node mkStart(String assing, String data){
        return new Start(assing, data);
    }

    public static Node mkEnd(String assing, String data){
        return new End(assing, data);
    }


    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Node getFirstNode() {
        return next.get(0);
    }

    public Node setNextNode(Node next) {
        this.next.add(next);
        return this;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public Node setNextNode(Node next, String trasition) {
        this.next.add(next);
        return this;
    }

    @Override
    public String toString() {
        return "Node{" +
                "ID=" + ID +
                ", assing='" + assing + '\'' +
                ", data='" + data + '\'' +
                ", next=" + next +
                ", metadata='" + metadata + '\'' +
                '}';
    }

    public void setAssing(String assing) {
        this.assing = assing;
    }

}