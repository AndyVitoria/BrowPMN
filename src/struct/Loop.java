package struct;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by PC-SALA1 on 03/07/2017.
 */
public class Loop extends Conditional {
    private String metadata;
    private static int LOOP = 0;
    private static ArrayList<String> pilhaLoop = new ArrayList<String>();

    public static Node mkLoop(String start, String end, String conditionStart, String conditionEnd){
        Node startLoop = mkAssing(String.valueOf(LOOP), new Str("[Loop]"), "[Loop]");
        Node loop = setNextNode(start, "loop_" + LOOP + "_start", conditionStart);
        Node endLoop = closeLoop("loop_" + LOOP + "_end", end, conditionEnd);

        String newMeta = loop.getMetadata() + endLoop.getMetadata() + startLoop.getMetadata();
        loop.setNext(new ArrayList<Node>());
        loop.setNextDescription(new ArrayList<String>());
        loop.setMetadata(newMeta);
        pilhaLoop.add("loop_" + LOOP);
        LOOP++;
        add(new Loop());
        return loop;
    }

    public void setMetadata(String meta){
        this.metadata = meta;
    }

    public String getMetadata(){
        return this.metadata;
    }




    public static Node closeLoop(String id, String end, String codition){
        //Node _loop = mkAssing(id, new Str("[Loop]"), "[Loop]");
        Node loop = setNextNode(id, end, codition);
        //loop.setMetadata(_loop.getMetadata());
        return loop;
    }

    public static String getTopo(){
        String node = null;
        if (pilhaLoop.size() > 0) {
            node = pilhaLoop.get(pilhaLoop.size() - 1);
        }
        return node;
    }

    @Override
    public Node pull(){
        Node node = new Str("");
        node.setMetadata("}\n");
        if (pilhaLoop.size() > 0){
            pilhaLoop.remove(pilhaLoop.size() -1);
        }

        return node;
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        return null;
    }
}
