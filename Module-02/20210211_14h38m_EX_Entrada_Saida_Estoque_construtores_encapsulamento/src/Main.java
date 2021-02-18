import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    /*
        Neste exemplo, que usa o exemplo de Product como base, vamos encapsular a
        classe Product, i.e., vamos encapsular seus atributos e métodos.
        Com isso, o programa principal em Main (ou em outra classe qualquer)
        Não poderá acessar os atributos ou métodos. Por exemplo, após que
        substituir public por private nmos atributos da classe Product,
        o comando System.out.println(product.name + ", " + product.price + ", " + product.quantity);
        deixa de funcionar.

        Agora, para acessar ou modificar os atributos da classe, preciso usar
        getters e setters, que nada mais são que métodos dentro da classe.

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter product data:");

        System.out.print("Name: ");

        String name = sc.nextLine();

        System.out.print("Price: ");

        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");

        int quantity = sc.nextInt();

        Product product = new Product(name, price, quantity);

        // System.out.println(product.name + ", " + product.price + ", " + product.quantity);

        System.out.println(product.toString());

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

        // Vamos testar os getters e setters

        System.out.println();

        product.setName("computer");
        System.out.println("Updated data: " + product);
        product.setPrice(1200.00);
        System.out.println("Updated data: " + product);

        System.out.println();

        System.out.println("Getting the name: " + product.getName());
        System.out.println("Getting the price: " + product.getPrice());
        System.out.println("Getting the quantity: " + product.getQuantity());


        sc.close();

    }

}
