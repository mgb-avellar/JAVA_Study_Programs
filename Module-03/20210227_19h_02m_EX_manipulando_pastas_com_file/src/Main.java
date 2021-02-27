import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String strPath = sc.nextLine();

        File path = new File(strPath); // Note que posso colocar em uma variável File
                                       //   tanto o caminho de um arquivo como de uma pasta

        // Quero colocar num arquivo uma lista dos diretórios dentro do diretório especificado em path
        // Para isso, crio um vetor de File e passo para ele uma lista de arquivos como path.listFiles
        // O argumento é uma especificação do tipo de coisa que estou filtrando, como nas funções lambda

        File[] folders = path.listFiles(File::isDirectory);  // isDirectory é uma função que lista apenas pastas

        System.out.println("FOLDERS:");

        for (File folder : folders) {  // imprimo na tela para testar
            System.out.println(folder);
        }

        // Listando apenas arquivos

        File[] files = path.listFiles(File::isFile);  // isFile é uma função que lista apenas arquivos
        System.out.println("FILES:");

        for (File file : files) {
            System.out.println(file);
        }

        // Agora criarei um diretório dentro desse caminho

        boolean success = new File(strPath + "/novoDiretorio").mkdir();

        System.out.println("Directory created successfully: " + success);
        sc.close();
    }
}
