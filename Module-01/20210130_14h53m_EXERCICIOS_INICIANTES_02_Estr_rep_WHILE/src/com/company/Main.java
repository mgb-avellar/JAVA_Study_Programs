package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 02

           Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
              cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O algoritmo será encerrado quando pelo
              menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

        */

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com as coordenas x e y:");

        x = sc.nextInt();
        y = sc.nextInt();

        while ( (x != 0) && ( y != 0) ) {

            if ( (x > 0) && (y > 0) ) {

                System.out.println("primeiro");
            }
            else if ( (x < 0) && (y > 0) ) {

                System.out.println("segundo");
            }
            //else if ( (x < 0) && (y < 0) ) {  /*  obviamente a condicao y < 0 aqui sera sempre verdadeira,
            //                                         pois os casos y > 0 foram testados acima
            //                                  */
            else if ( (x < 0) ) {

                System.out.println("terceiro");
            }
            else {

                System.out.println("quarto");
            }

            x = sc.nextInt();
            y = sc.nextInt();

        }

        sc.close();



    }
}
