package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 03

           Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
              de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

        */

        Scanner sc = new Scanner(System.in);

        int A, B, C, D;

        System.out.println();

        System.out.println("Entre com 4 inteiros:");

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        D = sc.nextInt();

        int DIFERENCA = A * B - C * D;

        System.out.println("A diferenca (A * B - C * D) vale: " + DIFERENCA);

        System.out.println();

        sc.close();

    }
}
