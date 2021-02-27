import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Código de leitura básica de arquivos

        File file = new File("/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/texto.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file); // É esse comando que me faz colocar tudo isso dentro to 'try': pode gerar uma exceção neste momento
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {  // Boa prática de programação: fechar o recurso, aqui o sc, dentro de um bloco finally.
            if (sc != null) {
                sc.close();
            }
        }
    }
}
