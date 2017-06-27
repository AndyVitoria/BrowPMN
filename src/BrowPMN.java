import java.io.*;

import struct.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class BrowPMN {
    public static void main(String[] args) throws IOException {
        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf(">>> ");
        String expr = rd.readLine();
        int lineNo = 0;
        Map<String, Node> ctx = new TreeMap<>();
        while (!expr.startsWith(":q")) {
            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
            BrowPMNLexer lexer = new BrowPMNLexer(input);
            lexer.setLine(lineNo);
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BrowPMNParser parser = new BrowPMNParser(tokens);
            BrowPMNParser.SttmContext ans = parser.sttm();
            if (ans.result != null) {
                System.out.printf("### %s\n", ans.result.toString());
                //System.out.printf("%s\n", ans.result.eval(ctx));
            }
            System.out.printf(">>> ");
            expr = rd.readLine();
            lineNo += 1;
        }
    }

/*    public static void main(String[] args) throws IOException {
        System.out.print(">>> ");
        Scanner inp = new Scanner(System.in);
        String s = inp.nextLine();
        System.out.println("Lido => " + s);
        ANTLRInputStream input = new ANTLRInputStream(s);
        BrowPMNLexer lexer = new BrowPMNLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrowPMNParser parser = new BrowPMNParser(tokens);
        BrowPMNParser.ProgContext ans = parser.prog();
        System.out.printf("\n>>> " + ans.result);
    }
public static void main(String[] args) throws IOException {
    BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
    System.out.printf(">>> ");
    String expr = rd.readLine();
    int lineNo = 0;
    Map<String, Expr> ctx = new TreeMap<>();
    while (!expr.startsWith(":q")) {
        ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
        BrowPMNLexer lexer = new BrowPMNLexer(input);
        lexer.setLine(lineNo);
        lexer.setCharPositionInLine(0);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        BrowPMNParser parser = new BrowPMNParser(tokens);
        BrowPMNParser.SttmContext ans = parser.sttm();
        if (ans.result != null) {
            System.out.printf("### %s\n", ans.result);
            //System.out.printf("%s\n", ans.result.eval(ctx));
        }
        System.out.printf(">>> ");
        expr = rd.readLine();
        lineNo += 1;
    }
    }*/
}
