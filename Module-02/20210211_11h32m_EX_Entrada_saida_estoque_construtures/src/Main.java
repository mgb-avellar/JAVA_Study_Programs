import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /*
        Contrutores obrigam que o programador forneça dados para os objetos no momento de sua instanciação.
        Note que na versão antiga deste exemplo, Product product = new Product(); cria um objeto product cujos
        campos são, por default, (null, 0.0, 0). Isso poderia levar a inconsistências caso o programador seja
        desatento.

        Primeiramente, vamos criar um construtor para a classe Product, lá dentro, e veremos que teremos que
        modificar o Main apropriadamente.
     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        // Product product = new Product();
        // Ao criar o construtor em Product, temos que tirar essa instanciação daqui e colocá-la após a leitura
        //   de variáveis

        System.out.println("Enter product data:");

        System.out.print("Name: ");

        String name = sc.nextLine();

        System.out.print("Price: ");

        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");

        int quantity = sc.nextInt();

        // A instanciação agora fica depois da leitura de variáveis

        Product product = new Product(name, price, quantity);

        System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        System.out.println(product.toString());
        System.out.println(product); // o toString() sua supressao no print

        System.out.println();

        System.out.print("Enter the quantity of products to be added to stock: ");

        quantity = sc.nextInt();

        product.addProducts(quantity);

        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.print("Enter the quantity of products to be removed from stock: ");

        quantity = sc.nextInt();

        product.removeProducts(quantity);

        System.out.println("Updated data: " + product);

        sc.close();

    }

}
