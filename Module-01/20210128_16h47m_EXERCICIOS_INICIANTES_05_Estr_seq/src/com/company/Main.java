package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 05

           Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
              código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

        */

        Locale.setDefault(Locale.US);

        int cod_p1, cod_p2, num_p1, num_p2;
        double valor_unit_p1, valor_unit_p2;

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Entre codigo peca 1, numero de pecas 1 e valor unitario da peca 1");
        cod_p1 = sc.nextInt();
        num_p1 = sc.nextInt();
        valor_unit_p1 = sc.nextDouble();

        System.out.println();

        System.out.println("Entre codigo peca 2, numero de pecas 2 e valor unitario da peca 2");
        cod_p2 = sc.nextInt();
        num_p2 = sc.nextInt();
        valor_unit_p2 = sc.nextDouble();

        double valor_total = num_p1 * valor_unit_p1 + num_p2 * valor_unit_p2;

        System.out.println();

        System.out.printf("VALOR A PAGAR: R$ %.2f", valor_total);

        System.out.println();

        sc.close();

    }
}
