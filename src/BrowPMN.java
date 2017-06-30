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

            String linha = lerArq.readLine(); // lê a primeira linha
// a variável "linha" recebe o valor "null" quando o processo
// de repetição atingir o final do arquivo texto
            while (linha != null) {
                System.out.printf("%s\n", linha);
                arquivo.add(linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }

            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }

        return arquivo;
    }

    public static void main(String[] args) throws IOException {
        ArrayList<String> arquivo = lerArquivo("teste.txt");

        ArrayList<String> saida = new ArrayList<String>();
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
                System.out.println(ans.result);
                System.out.println(ans.result.eval(ctx).getName());
                System.out.println(ans.result.eval(ctx));
                System.out.println(String.valueOf(ctx.values()) + '\n');

                if (ans.result.getMetadata() != null)
                    saida.add(ans.result.getMetadata());
            }
            System.out.printf(">>> ");
            lineNo += 1;
        }
        System.out.println("\n\n\n");
        for(int i = 0; i < saida.size(); i++){
            System.out.println(saida.get(i));
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
