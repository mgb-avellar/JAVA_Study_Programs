import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        /*
          Fazer um programa para ler um número inteiro N e a altura de N
            pessoas. Armazene as N alturas em um vetor. Em seguida, mostrar a
            altura média dessas pessoas.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int N;

        System.out.print("Enter N: ");
        N = sc.nextInt();

        /*
          Declaração de vetores em JAVA:
          double - tipo, [] implica vetor,
          new - instanciação, double - tipo dos elementos, [N] - tamanho
          ex. double[] vect = new double[N];

         */

        double[] vect = new double[N];

        double soma = 0.0;

        System.out.printf("Enter the %d heights: \n", N);

        for (int i=0; i < N; i++ ) {

            vect[i] = sc.nextDouble();
            soma += vect[i];
        }

        double mediaAltura = soma / N;

        System.out.printf("A altura média é: %.2f \n", mediaAltura);




        sc.close();
    }
}
