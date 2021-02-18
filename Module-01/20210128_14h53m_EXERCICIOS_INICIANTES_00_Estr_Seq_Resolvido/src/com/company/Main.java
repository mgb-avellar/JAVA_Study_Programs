package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio:

           Fazer um programa para ler as medidas da largura e comprimento de um terreno retangular
              com uma casa decimal, bem como o valor do metro quadrado do terreno com duas casas
              decimais. Em seguida, o programa deve mostrar o valor da área do terreno, bem como
              o valor do preco do terreno, ambos com duas casas decimais.
              Ex. entradas: 10.0  30.0  200.00
                  saidas: 300.00 60000.00
        */

        Locale.setDefault(Locale.US);

        double width, length, area, sqm_price, total_price;

        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("Enter the width: ");
        width = sc.nextDouble();

        System.out.println("Enter the length: ");
        length = sc.nextDouble();

        System.out.println("Enter the sq-meter price: ");
        sqm_price = sc.nextDouble();

        System.out.println();

        area = width * length;
        total_price = area * sqm_price;

        System.out.printf("The building sit has %.2f square meters. \n", area);
        System.out.printf("The price of the building sit is %.2f dollars. \n", total_price);

        System.out.println();

        sc.close();

    }
}
