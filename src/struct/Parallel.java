package struct;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by PC-SALA1 on 03/07/2017.
 */
public class Parallel extends Conditional {
    private static int DO = 0;
    private static ArrayList<String> pilhaDO = new ArrayList<String>();

    public static Node mkParallel(String start, String end, String conditionStart, String conditionEnd){
        /* Colocar isso em um switch para verificar se é inicio ou fim de DO */
        Node startDo = mkAssing("do_" + DO + "_start", new Str("+"), "+");
        Node parallel = setNextNode(start, "do_" + DO + "_start", conditionStart);
        Node endDo = closeParallel("do_" + DO + "_end", end, conditionEnd);
        parallel.setMetadata(startDo.getMetadata() + endDo.getMetadata());
        pilhaDO.add("do_" + DO);
        DO++;
        add(new Parallel());
        return parallel;
    }

    public static Node closeParallel(String id, String end, String codition){
        Node _do = mkAssing(id, new Str("+"), "+");
        Node parallel = setNextNode(id, end, codition);
        parallel.setMetadata(_do.getMetadata());
        return parallel;
    }

    public static String getTopo(){
        String node = null;
        if (pilhaDO.size() > 0) {
            node = pilhaDO.get(pilhaDO.size() - 1);
        }
        return node;
    }

    @Override
    public Node pull(){
        if (pilhaDO.size() > 0)
            pilhaDO.remove(pilhaDO.size() -1);
        return null;
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        return null;
    }
    
}
