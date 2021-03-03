import entities.Product;
import util.UperCaseName;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("HD Case", 80.90));

        /*
        Fazer um programa que, a partir de uma lista de produtos, gere uma
nova lista contendo os nomes dos produtos em caixa alta.
         */

        /*
        Para primeira versão:
         */

        // a função map aplica uma função a cada elemento de uma stream gerando nova strem
        //  com elementos transformados.
        // acontece que não podemos usar map em listas, por isso a necessida de transformar
        //  em stream

        List<String> upperCasedNamesList =  list.stream().map(new UperCaseName()).collect(Collectors.toList());

        System.out.println();

        // Veja a maneira legal de imprimir:

        //for (Product p : list) {
        //    System.out.println(p);
        //}

        upperCasedNamesList.forEach(System.out::println);

    }


}

