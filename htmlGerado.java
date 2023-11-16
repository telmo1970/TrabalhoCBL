import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class htmlGerado {

    public static void cloneHtml(String sourcePath, String destinationPath) {
        try {
            // Lê o conteúdo do arquivo HTML existente
            byte[] htmlContent = Files.readAllBytes(Paths.get(sourcePath));

            // Escreve o conteúdo no novo arquivo HTML
            Files.write(Paths.get(destinationPath), htmlContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String sourceHtml = "#"; 
        String newHtml = "#"; 

        cloneHtml(sourceHtml, newHtml);
        System.out.println("HTML gerado com sucesso");
    }
}
    

