package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 02

           Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
              casas decimais conforme exemplos.

        */

        Locale.setDefault(Locale.US);

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o raio do circulo: ");

        double r = sc.nextDouble();
        double pi = 3.14159;
        double area = pi * Math.pow(r, 2.0);

        System.out.println();

        System.out.printf("A area do circulo de raio %.2f eh %.4f. \n", r, area);

        System.out.println();

        sc.close();

    }
}
