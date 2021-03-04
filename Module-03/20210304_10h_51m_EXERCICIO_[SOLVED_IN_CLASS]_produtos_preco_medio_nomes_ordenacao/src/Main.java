
import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    /*
    Fazer um programa para ler um conjunto de produtos a partir de um
    arquivo em formato .csv (suponha que exista pelo menos um produto).
    Em seguida mostrar o preço médio dos produtos. Depois, mostrar os
    nomes, em ordem decrescente, dos produtos que possuem preço
    inferior ao preço médio.
    Veja exemplo na próxima página.

    ENTRADA:
    Tv,900.00
    Mouse,50.00
    Tablet,350.50
    HD Case,80.90
    Computer,850.00
    Monitor,290.00

    SAÍDA:
    Enter full file path: xxxxxxx
    Average price: 420.23
    Tablet
    Mouse
    Monitor
    HD Case

    /home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/productList_streams.csv

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            List<Product> list = new ArrayList<>();  // crio a lista de produtos

            String line = br.readLine();
            while (line != null) {
                // adiciono os produtos no arquivo csv na lista criada acima

                String[] fields = line.split(",");
                list.add(new Product(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double avg = list.stream()
                    .map(p -> p.getPrice()) // Aqui pego apenas o preço
                    .reduce(0.0, (x,y) -> x + y) / list.size();  // aqui somo todos e acho a média

            System.out.println();
            System.out.println("Average price: " + String.format("%.2f", avg));

            Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            // A variável comp acima recebe uma função para comparar dois parâmetros (vide abaixo)

            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)  // Aqui filtro os produtos com preço abaixo da média
                    .map(p -> p.getName()).sorted(comp.reversed()) // aqui pego apenas os nomes dos produtos
                                                                   //   filtrados e ordeno-os em ordem alfabética decrescente
                                                                   //   com a variável comp do tipo Comparator que criei acima
                    .collect(Collectors.toList()); // aqui transformo a stream final em lista novamente

            /*
            Observação sobre 'comp.reversed()': é um método default de Comparator (não tem relação com o .sorted())
            O .reversed() compara os tipos dados e fornece como retorno o comparador reverso, ou seja, se o normel
            retorna o número 1, o .reversed() retorna o -1.
             */

            System.out.println();
            System.out.println("List of products whose price is less than the average price: ");
            names.forEach(System.out::println);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}