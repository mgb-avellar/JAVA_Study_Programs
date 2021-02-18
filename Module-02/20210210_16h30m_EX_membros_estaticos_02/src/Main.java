import util.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Versão 2 - programa com classe simples (membros não estáticos)

        Fazer um programa para ler um valor numérico qualquer, e daí mostrar
           quanto seria o valor de uma circunferência e do volume de uma esfera
           para um raio daquele valor. Informar também o valor de PI com duas
           casas decimais.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        /*
           Como os membros da classe Calculator não são estaticos (tiramos os static's)
           sou obrigado a instanciar os objetos para poder usá-la.

         */

        Calculator calc = new Calculator();  // instanciando o objeto

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = calc.circumference(radius); // usando os atributos (note o calc.xx)
        double v = calc.volume(radius); // usando os atributos (note o calc.xx)

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", calc.PI); // usando os atributos (note o calc.xx)

        sc.close();

    }
}
