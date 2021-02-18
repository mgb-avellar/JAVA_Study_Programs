package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 02

           Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

        */

        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro:");

        x = sc.nextInt();

        if ( x % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}
