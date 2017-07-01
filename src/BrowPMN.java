import java.io.*;

import struct.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;


public class BrowPMN {
    public static ArrayList<String> lerArquivo(String nome){
        ArrayList<String> arquivo = new ArrayList<String>();
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                arquivo.add(linha);
                linha = lerArq.readLine();
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        return arquivo;
    }

    public static void escreverArquivo(ArrayList<String> arquivo) throws IOException {
        FileWriter arq = new FileWriter(arquivo.get(0) + "gv");
        PrintWriter gravarArq = new PrintWriter(arq);

        for (int i=1; i< arquivo.size(); i++) {
            gravarArq.printf(arquivo.get(i));
        }
        arq.close();
    }


    public static void main(String[] args) throws IOException {
        ArrayList<String> arquivo = lerArquivo("teste.txt");

        ArrayList<String> saida = new ArrayList<String>();
        saida.add("teste.");
        saida.add("digraph G {\ncompound=true;\n");

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf(">>> ");
        String expr;
        int lineNo = 0;
        Map<String, Node> ctx = new TreeMap<>();
        for(int i=0; i<arquivo.size(); i++) {
            expr= arquivo.get(i);
            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
            BrowPMNLexer lexer = new BrowPMNLexer(input);
            lexer.setLine(lineNo);
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            BrowPMNParser parser = new BrowPMNParser(tokens);
            BrowPMNParser.SttmContext ans = parser.sttm();
            if (ans.result != null) {
                System.out.println(ans.result.toString());
                System.out.println(ans.result.getFluxe());
                //System.out.println(ans.result.eval(ctx));
                //System.out.println(String.valueOf(ctx.values()) + '\n');

                if (ans.result.getMetadata() != null)
                    saida.add(ans.result.getMetadata());
            }
            System.out.printf(">>> ");
            lineNo += 1;
        }
        System.out.println("\n\n\n");
        saida.add("}");

        BrowPMN.escreverArquivo(saida);

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
