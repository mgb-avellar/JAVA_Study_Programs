package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 04

           Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
              começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

        */

        int x, y, duracao;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a hora inicial e final, nessa ordem (formato numero inteiro):");

        x = sc.nextInt();
        y = sc.nextInt();

        if ( ( x < 0 ) || ( y < 0) ) {
            System.out.println("A hora nao pode ser um numero negativo.");
        }
        else if ( x >= y ) {

            duracao = (24 - x) + y;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }
        else {

            duracao = y - x;
            System.out.printf("O JOGO DUROU %d HORA(S)", duracao);
        }

        System.out.println();

        sc.close();

    }
}
