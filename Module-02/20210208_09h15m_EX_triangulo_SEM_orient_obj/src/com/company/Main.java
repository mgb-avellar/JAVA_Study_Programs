package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas
           válidas). Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos
           possui a maior área.
        A fórmula para calcular a área de um triângulo a partir das medidas de seus lados A, B e C e a
           fórmula de Heron.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double xA, xB, xC, yA, yB, yC, areaX, areaY, p;

        System.out.println("Entre com as medidas do triangulo X:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Entre com as medidas do triangulo Y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        p = (xA + xB + xC) / 2.0;

        areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        p = (yA + yB + yC) / 2.0;

        areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        System.out.printf("Area do triangulo X: %.4f \n", areaX);
        System.out.printf("Area do triangulo Y: %.4f \n", areaY);

        if ( areaX > areaY) {
            System.out.println("Triangulo X tem area maior");
        }
        else {
            System.out.println("Triangulo Y tem area maior");
        }

        sc.close();

    }
}
