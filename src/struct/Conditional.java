package struct;

import java.util.ArrayList;

public abstract class Conditional extends Node{
    private static ArrayList<Conditional> pilhaConditional = new ArrayList<Conditional>();

    public static Conditional getOpen() {
        Conditional node = null;
        if (pilhaConditional.size() > 0){
            node = pilhaConditional.get(pilhaConditional.size()-1);
            pilhaConditional.remove(pilhaConditional.size()-1);
        }
        return node;
    }

    protected static void add(Conditional node){
        pilhaConditional.add(node);
    }

    public static Node pullCond(){
        return getOpen().pull();
    }

    public Node pull() {return null;}
}
