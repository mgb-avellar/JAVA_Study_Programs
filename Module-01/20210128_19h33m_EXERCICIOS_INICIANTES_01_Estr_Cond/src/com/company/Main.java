package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 01

           Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

        */

        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com um numero inteiro:");

        x = sc.nextInt();

        if ( x < 0) {
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}
