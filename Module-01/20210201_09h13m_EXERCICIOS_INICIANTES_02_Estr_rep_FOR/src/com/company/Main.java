package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 02

           Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
              Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
              essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

        */

        Scanner sc = new Scanner(System.in);

        int N, x, somaIn = 0, somaOut = 0;

        System.out.println("Entre com o numero N de inteiros a serem lidos:");

        N = sc.nextInt();

        System.out.println("Entre com os N inteiros");

        for (int i = 0; i < N; i++) {

            x = sc.nextInt();

            if ( (x >= 10) && (x <=20) ) {

                somaIn += 1;
            }
            else {

                somaOut += 1;
            }
        }

        System.out.println(somaIn + " in");
        System.out.println(somaOut + " out");

        sc.close();
    }
}
