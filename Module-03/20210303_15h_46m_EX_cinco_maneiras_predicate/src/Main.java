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
        Para a versão 2, criei um método estático em Product e jogo ele em list.removeIf()
         */

       // list.removeIf(new ProductPredicate());

        /*
        Para a versão 3, o mesmo método, porém em versão não estática
         */

        //list.removeIf(Product::staticProductPredicate);

        list.removeIf(Product::nonStaticProductPredicate);

        System.out.println();

        for (Product p : list) {
            System.out.println(p);
        }


    }


}
