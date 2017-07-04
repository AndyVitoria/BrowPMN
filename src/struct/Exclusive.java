package struct;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by PC-SALA1 on 02/07/2017.
 * Faltar Criar os demais condicionais e inserir o final de condicional exclusivo
 */
public class Exclusive extends Conditional {
    private static int IF = 0;
    private static ArrayList<String> pilhaIF = new ArrayList<String>();

    public static Node mkExclusive(String start, String end, String conditionStart, String conditionEnd){
        Node startIf = mkAssing("if_" + IF + "_start", new Str("X"), "X");
        Node exclusive = setNextNode(start, "if_" + IF + "_start", conditionStart);
        Node endIf = closeExclusive("if_" + IF + "_end", end, conditionEnd);
        exclusive.setMetadata(startIf.getMetadata() + endIf.getMetadata());
        pilhaIF.add("if_" + IF);
        IF++;
        add(new Exclusive());
        return exclusive;
    }

    public static Node closeExclusive(String id, String end, String codition){
        Node _if = mkAssing(id, new Str("X"), "X");
        Node exclusive = setNextNode(id, end, codition);
        exclusive.setMetadata(_if.getMetadata());
        return exclusive;
    }

    public static String getTopo(){
        String node = null;
        if (pilhaIF.size() > 0) {
            node = pilhaIF.get(pilhaIF.size() - 1);
        }
        return node;
    }

    @Override
    public Node pull(){
        if (pilhaIF.size() > 0){
            pilhaIF.remove(pilhaIF.size() -1);
        }
        return null;
    }

    @Override
    public Node eval(Map<String, Node> ctx) {
        return null;
    }
}
