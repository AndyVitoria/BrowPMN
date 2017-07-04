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
import java.util.regex.Pattern;


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
        FileWriter arq = new FileWriter(arquivo.get(0));
        PrintWriter gravarArq = new PrintWriter(arq);

        for (int i=1; i< arquivo.size(); i++) {
            gravarArq.printf(arquivo.get(i));
        }
        arq.close();
    }


    public static void main(String[] args) throws IOException {
        String arqName;
        if (args.length == 0) {
            System.out.print("Informe o caminho do arquivo: ");
            arqName = new Scanner(System.in).nextLine();
        }
        else
            arqName = args[0];
        ArrayList<String> arquivo = lerArquivo(arqName);

        ArrayList<String> saida = new ArrayList<String>();
        String[] temp = arqName.split (Pattern.quote ("."));
        // Arquivo de Saída
        saida.add(temp[0] + ".dot");
        // Cabeçalho do arquivo de saida
        saida.add("digraph G {\ncompound=true;\n");

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
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
                //System.out.println(ans.result.toString());
                //System.out.println(ans.result.getFluxe());
                //System.out.println(ans.result.eval(ctx));
                //System.out.println(String.valueOf(ctx.values()) + '\n');

                if (ans.result.getMetadata() != null)
                    // Inserção dos metadados do arquivo de saida
                    saida.add(ans.result.getMetadata());
            }
            lineNo += 1;
        }
        // Fechamento do arquivo de saida
        saida.add("}");

        // Salvando arquivo .dot
        BrowPMN.escreverArquivo(saida);

    }
}
