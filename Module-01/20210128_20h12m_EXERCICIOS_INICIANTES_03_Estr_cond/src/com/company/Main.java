package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 03

           Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
              Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
              ordem crescente ou decrescente.

        */

        int x, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com dois numeros inteiros:");

        x = sc.nextInt();
        y = sc.nextInt();

        if ( ( x % y == 0 ) || ( y % x == 0 ) ) {
            System.out.println("Sao multiplos");
        }
        else {
            System.out.println("Nao sao multiplos");
        }

        sc.close();

    }
}
