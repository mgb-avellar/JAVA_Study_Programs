package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 07

           Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
              de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
              ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
              Se o ponto estiver na origem, escreva a mensagem “Origem”.
              Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
              situação.
        */

        Locale.setDefault(Locale.US);

        double x0, y0, x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com x e y, reais, com uma casa decimal:");

        x0 = sc.nextDouble();
        y0 = sc.nextDouble();

        x = Math.round(x0 * 10) / 10.0;
        y = Math.round(y0 * 10) / 10.0;

        if ( (x == 0.0) && (y == 0.0) ) {

            System.out.println("Origem");
        }
        else if ( (x != 0.0) && ( y == 0.0) ) {

            System.out.println("Eixo X");
        }
        else if ( (x == 0.0) && ( y != 0.0) ) {

            System.out.println("Eixo Y");
        }
        else if ( (x < 0.0) && ( y > 0.0) ) {

            System.out.println("Q2");
        }
        else if ( (x < 0.0) && ( y < 0.0) ) {

            System.out.println("Q3");
        }
        else if ( (x > 0.0) && ( y > 0.0) ) {

            System.out.println("Q1");
        }
        else {

            System.out.println("Q4");
        }

    }
}
