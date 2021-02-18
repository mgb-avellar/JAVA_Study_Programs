import entities.Product;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
          Fazer um programa para ler um número inteiro N e os dados (nome e
            preço) de N Produtos. Armazene os N produtos em um vetor. Em
            seguida, mostrar o preço médio dos produtos.

         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.print("Entre com o numero de produtos: ");
        N = sc.nextInt();

         /*
          Declaração de vetores de objetos tipo classe em JAVA:
          Classe - tipo, [] implica vetor,
          new - instanciação, Classe - tipo dos elementos, [N] - tamanho
          ex.  Product[] vect = new Product[N];

         */

        Product[] vect = new Product[N];
        double soma = 0.0;

        // for (int i =0; i < N; i++) {
        for (int i =0; i < vect.length; i++) {   // Essa é uma opção elegante

            sc.nextLine();
            System.out.print("Digite o nome de um produto: ");
            String name = sc.nextLine();
            System.out.print("Digite seu preço: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price); // Note que nesse caso PRECISO instanciar

            soma += vect[i].getPrice();

        }

        System.out.printf("O preço médio dos produtos é %.2f \n", soma / vect.length);

        sc.close();
    }
}
