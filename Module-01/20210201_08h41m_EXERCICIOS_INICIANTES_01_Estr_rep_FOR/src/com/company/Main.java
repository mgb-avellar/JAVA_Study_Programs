package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 01

           Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
              X, se for o caso.

        */

        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Entre com x:");
        x = sc.nextInt();

        if ( (x >=1 ) && (x <= 1000) ) {

            for (int i = 1; i <= x; i++) {

                if ( i % 2 != 0) {

                    System.out.println(i);
                }
            }

        }
        else {
            System.out.println("Valor deve estar entre 1 e 1000.");
        }

        sc.close();

    }
}
