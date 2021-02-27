import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String path = "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/texto.txt";
        BufferedReader br = null;
        FileReader fr = null;

        // Esse será um processo manual de utilização dessas classes.
        // Nos próximos vídeos esses processos serão otimizados.

        try {
            fr = new FileReader(path);   // Instancio o file reader
            br = new BufferedReader(fr); // Instancio o buffered reader a partir do file reader,
                                         //   pois o buffered reader é uma abstração maior.
                                         // Essa sequência deixa mais flexivel o sistema de
                                         //   leitura de arquivos.

            String line = br.readLine(); // Lê uma linha do arquivo

            while (line != null) {
                System.out.println(line);  // imprimo a linha
                line = br.readLine();      // leio uma nova linha.
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            try {  // Esse bloco 'try' é necessário porque pode surgir uma exceção na hora de fechar as streams.
                if (br != null)
                    br.close();
                if (fr != null)
                    fr.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
