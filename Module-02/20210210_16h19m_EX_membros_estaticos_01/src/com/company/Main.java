package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double PI = 3.141592654;  // o "final" transforma a variavel
                                                  // PI em uma constante imutavel

    public static void main(String[] args) {

        /* Versão 1 - programa simples

        Fazer um programa para ler um valor numérico qualquer, e daí mostrar
           quanto seria o valor de uma circunferência e do volume de uma esfera
           para um raio daquele valor. Informar também o valor de PI com duas
           casas decimais.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = circumference(radius);
        double v = volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", PI);

        sc.close();

    }

    public static double circumference(double radius) {
        return 2.0 * PI * radius;
    }

    public static double volume(double radius) {
        return 4.0 * PI * radius * radius * radius / 3.0;
    }

    /* Aqui o static é importante: significa que não podemos chamar um metodo
          que não é estático dentro de um que é estático.
     */
}
