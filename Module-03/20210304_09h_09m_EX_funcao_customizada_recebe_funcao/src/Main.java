import entities.Product;
import services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        List<Product> productList = new ArrayList<>();

        productList.add(new Product("TV", 900.00));
        productList.add(new Product("Mouse", 50.00));
        productList.add(new Product("Tablet", 350.50));
        productList.add(new Product("HD Case", 80.90));

        ProductService ps = new ProductService();

        // Eu poderia colocar o predicado direto em filtered.List, mas decidi colocar fora para fazer testes

        // Predicate<Product> pred = product -> product.getProductName().charAt(0) == 'T';
        // Predicate<Product> pred = product -> product.getProductName().charAt(0) == 'T';
        Predicate<Product> pred = product -> product.getProductPrice() <= 100.0;

        double sum = ps.filteredSum(productList, pred);

        System.out.println();
        System.out.println("Sum = " + String.format("%.2f", sum));


    }
}
