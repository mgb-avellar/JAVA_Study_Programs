package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 05

           Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
              Lembrando que, por definição, fatorial de 0 é 1.
        */

        Scanner sc = new Scanner(System.in);

        int N, fat=1;

        System.out.println("Entre com um inteiro positivo");

        N = sc.nextInt();

        if ( N == 1 || N == 0) {

            System.out.println("fatorial " + fat);
        }
        else if ( N < 0) {

            System.out.println("N deve ser positivo");
        }
        else {

            for (int i = 0; i < N; i++) {

                fat = fat * (N - i);
            }

            System.out.println("fatorial " + fat);
        }

        sc.close();
    }
}
