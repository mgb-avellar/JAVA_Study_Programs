package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

           Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
              Fahrenheit. Perguntar se o usuário deseja repetir (s/n). Caso o usuário digite "s", repetir o
              programa.

        */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char resp;

        double tempC, tempF;


        do {

            System.out.println("Digite a temperatura em Celsius:");
            tempC = sc.nextDouble();

            tempF = 9.0 * tempC / 5.0 + 32.0;

            System.out.printf("Equivalente em Fahrenheit: %.1f \n", tempF);

            System.out.print("Deseja repetir? (s/n) " );

            resp = sc.next().charAt(0);

        } while (resp != 'n');

        sc.close();


    }
}
