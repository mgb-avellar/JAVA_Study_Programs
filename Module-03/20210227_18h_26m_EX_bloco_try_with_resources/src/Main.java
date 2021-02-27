import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/texto.txt";

        // Não preciso mais iniciar o fr e o br como no exemplo passado

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine(); // Lê uma linha do arquivo

            while (line != null) {
                System.out.println(line);  // imprimo a linha
                line = br.readLine();      // leio uma nova linha.
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Note que não preciso mais do 'finally': esse 'try-with-resources' fecha as
        //   instâncias automaticamente.

        /*
        ESSE SERÁ NOSSO MÉTODO PADRÃO PARA LER ARQUIVOS.
         */
    }
}
