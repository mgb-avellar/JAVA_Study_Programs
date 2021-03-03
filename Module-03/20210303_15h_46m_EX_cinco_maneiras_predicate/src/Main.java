import entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

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

        /*
        Para a versão 4, crio uma variável Predicate
         */

        //list.removeIf(Product::nonStaticProductPredicate);

        Predicate<Product> predicate = product -> product.getPrice() >= 100.0; // 100.0 pode ser dado em variável ou
                                                                               //  entrado pelo usuário

        list.removeIf(predicate);

        System.out.println();

        for (Product p : list) {
            System.out.println(p);
        }


    }


}
