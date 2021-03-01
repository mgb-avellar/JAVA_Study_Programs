import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Depois, faça um programa para ler um arquivo contendo funcionários (nome e salário) no
formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Vou usar o versionamento do github.


         */

        List<String> list = new ArrayList<>();

        String path = "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/nameList.txt";

        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String name = br.readLine();

            while (name != null) {
                list.add(name);
                name = br.readLine();
            }
            Collections.sort(list);
            for (String s : list) {
                System.out.println(s);
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
