import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // Criando um vetor de strings.
        String[] lines = new String[] { "Good morning", "Good afternoon", "Good night" };

        // Digo o local onde quero criar o arquivo
        String path = "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/texto2.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) { // Bloco try-with-resources

            // Percorro meu vetor de strings, linha a linha
            for (String line : lines) {
                bw.write(line); // faço a leitura da linha (essa construção não tem quebra de linha automática)
                bw.newLine();  // quebro a linha aqui
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // Agora vou inserir ao final do meu arquivo criado mais algumas strings
        // Para não recriar o arquivo perdendo o que já tinha, insiro um 'true'
        //   na instanciação do FileWriter

        lines = new String[] { " ", "Bom dia", "Boa tarde", "Boa noite" };

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) { // Bloco try-with-resources

            // Percorro meu vetor de strings, linha a linha
            for (String line : lines) {
                bw.write(line); // faço a leitura da linha (essa construção não tem quebra de linha automática)
                bw.newLine();  // quebro a linha aqui
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
