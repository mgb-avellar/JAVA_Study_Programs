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

        A diferença para o exemplo anterior é que agora vou criar uma sobrecarga
        no construtor. A sobrecarga é como uma repetição do construtor original
        sem alguns parâmetros. Esse será o caso de quanto quisermos instanciar
        um novo produto mas que ainda não temos no estoque, de modo que sua
        quantidade inicial é zero. Acontece que agora, não preciso dizer explicitamente
        que a quantidade é zero.
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

        // Abaixo, vamos repetir todo o código acima para testar a sobrecarga

        sc.nextLine();
        System.out.println();

        System.out.println("Enter product data:");

        System.out.print("Name: ");

        name = sc.nextLine();

        System.out.print("Price: ");

        price = sc.nextDouble();

        // Deletamos daqui o pedido para o usuário entrar com a quantidade

        product = new Product(name, price); // Note a instanciação sem quantity!

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
