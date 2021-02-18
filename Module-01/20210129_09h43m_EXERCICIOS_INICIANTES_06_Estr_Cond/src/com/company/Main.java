package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 06

           Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
              seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
              nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.
        */

        Locale.setDefault(Locale.US);

        double x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um valor: ");

        x = sc.nextDouble();

        if ( x >= 0.0 && x <= 25.0 ) {

            System.out.println("Intervalo [0, 25]");
        }
        else if ( x > 25.0 && x <= 50.0 ) {

            System.out.println("Intervalo (25, 50]");
        }
        else if ( x > 50.0 && x <= 75.0 ) {

            System.out.println("Intervalo (50, 75]");
        }
        else if ( x > 75.0 && x <= 100.0 ) {

            System.out.println("Intervalo (75, 100]");
        }
        else {

            System.out.println("Fora de intervalo");
        }

        System.out.println();
        sc.close();

    }
}
