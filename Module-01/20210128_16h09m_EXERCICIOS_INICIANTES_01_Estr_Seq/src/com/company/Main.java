package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 01

           Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
              mensagem explicativa, conforme exemplos do PDF.

        */

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o primeiro inteiro: ");

        int x = sc.nextInt();

        System.out.println("Entre com o segundo inteiro: ");

        int y = sc.nextInt();

        System.out.println("SOMA = " + (x + y) );

        System.out.println();

        sc.close();

    }
}
