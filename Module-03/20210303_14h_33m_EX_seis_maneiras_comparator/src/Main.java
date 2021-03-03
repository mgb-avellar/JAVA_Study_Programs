import entities.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        /*
         Com a classe MyComparator, preciso mudar de Collections.sort() para
         list.sort()
         */

        //Collections.sort(list);

        /*
        Com uma classe anônima dentro do Main, não preciso mais da classe MyComparator e
        list.sort() precisa ter seu argumento atualizado
         */

        //list.sort(new MyComparator());

        Comparator<Product> comp = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };

        list.sort(comp);

        System.out.println();

        for (Product p : list) {
            System.out.println(p);
        }


    }
}
