// programa que leia um arquivo texto em html de 162 linhas e gere um novo arquivo texto custom html de 162 linhas  da mesma forma que o arquivo original e sem alteracoes

import java.io.*;

public class projeto {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader("/Users/luccas/Desktop/Projetos em Java/JavaProject/src/projetoDemo.html"));
        BufferedWriter out = new BufferedWriter(new FileWriter("/Users/luccas/Desktop/Projetos em Java/JavaProject/src/projetoDemo2.html"));
        String linha;
        while ((linha = in.readLine()) != null) {
            out.write(linha);
            out.newLine();
        }
        in.close();
        out.close();
    }
}




