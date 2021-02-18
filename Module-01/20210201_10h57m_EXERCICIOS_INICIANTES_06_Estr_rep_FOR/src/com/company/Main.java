package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 06

           Ler um número inteiro N e calcular todos os seus divisores.

        */

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Entre com um inteiro");

        N = sc.nextInt();

        for (int i = 1; i <= N; i++) {

            if ( N % i == 0 ) {

                System.out.println(i);
            }

        }

        sc.close();

    }
}
