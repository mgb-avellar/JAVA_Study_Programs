package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 03

           Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
              de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
              conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
              peso 5.

        */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int N;

        double  x, y, z, mediaPond;

        System.out.println("Entre com o numero de casos a serem lidos.");

        N = sc.nextInt();

        System.out.println("Entre com os tres numeros para a media");

        for (int i = 0;  i < N; i++) {

            x = sc.nextDouble();
            y = sc.nextDouble();
            z = sc.nextDouble();

            mediaPond = ( 2 * x + 3 * y + 5 * z ) / 10.0;
            System.out.printf("%.1f \n", mediaPond);

        }

        sc.close();

    }
}
