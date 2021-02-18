package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 07

           Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
              começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
              exemplo.

        */

        Scanner sc = new Scanner(System.in);

        int N;

        System.out.println("Entre com um inteiro");

        N = sc.nextInt();

        for (int i = 1; i <=N; i++) {

            System.out.printf("%d %.0f %.0f \n", i, Math.pow(i, 2.0), Math.pow(i, 3));

        }


        sc.close();


    }
}
