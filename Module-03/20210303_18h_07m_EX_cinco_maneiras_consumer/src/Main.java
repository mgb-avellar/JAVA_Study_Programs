import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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
        Queremos aumentar o preço de cada produto em 10%
         */

        /*
        Para segunda versão:
         */

        //list.forEach(new PriceUpdate());

        /*
        Para segunda versão:
         */

        //list.forEach(Product::staticPriceUpdate);

        /*
        Para terceira versão:
         */

        //list.forEach(Product::nonStaticPriceUpdate);

        /*
        Para quarta versão:
         */

        //Consumer<Product> cons = p -> p.setPrice(p.getPrice() * 1.10);

        //list.forEach(cons);

        /*
        Para quinta versão:
         */

        list.forEach(p -> p.setPrice(p.getPrice() * 1.10));

        System.out.println();

        // Veja a maneira legal de imprimir:

        //for (Product p : list) {
        //    System.out.println(p);
        //}

        list.forEach(System.out::println);

    }


}

