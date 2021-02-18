package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 04

           Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
              segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

        */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int N;

        double x, y;

        System.out.println("Entre com o numero N de pares de numeros:");

        N = sc.nextInt();

        System.out.println("Entre com os pares de numeros:");

        for (int i = 0; i < N; i++) {

            x = sc.nextDouble();
            y = sc.nextDouble();

            if ( y == 0.0) {

                System.out.println("Divisao impossivel");
            }
            else {

                System.out.printf("%.1f \n", x / y);
            }
        }

        sc.close();
    }
}
