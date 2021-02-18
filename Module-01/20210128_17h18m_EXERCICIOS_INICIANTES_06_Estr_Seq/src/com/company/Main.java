package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 06

           Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
              mostre:

              a) a área do triângulo retângulo que tem A por base e C por altura.
              b) a área do círculo de raio C. (pi = 3.14159)
              c) a área do trapézio que tem A e B por bases e C por altura.
              d) a área do quadrado que tem lado B.
              e) a área do retângulo que tem lados A e B.
        */

        Locale.setDefault(Locale.US);

        System.out.println();

        double A, B, C;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre os valores de A, B e C:");

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double areaTri, areaCirc, areaTrap, areaQuad, areaRet;

        areaTri = (A * C) / 2.0;
        areaCirc = 3.14159 * Math.pow(C, 2.0);
        areaTrap = (A + B) * C / 2.0;
        areaQuad = Math.pow(B, 2.0);
        areaRet = A * B;

        System.out.printf("TRIANGULO: %.3f \n", areaTri);
        System.out.printf("CIRCULO: %.3f \n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f \n", areaTrap);
        System.out.printf("QUADRADO: %.3f \n", areaQuad);
        System.out.printf("RETANGULO: %.3f \n", areaRet);

        sc.close();

    }
}
