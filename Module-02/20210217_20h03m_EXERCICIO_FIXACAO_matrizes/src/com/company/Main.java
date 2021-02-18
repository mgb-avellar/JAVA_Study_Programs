package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler dois números inteiros M e N, e depois ler
                uma matriz de M linhas por N colunas contendo números inteiros,
                podendo haver repetições. Em seguida, ler um número inteiro X que
                pertence à matriz. Para cada ocorrência de X, mostrar os valores à
                esquerda, acima, à direita e abaixo de X, quando houver, conforme
                exemplo.

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Entre com o número de linhas: ");
        int m = sc.nextInt();
        System.out.print("Entre com o número de colunas: ");
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];

        System.out.println();
        System.out.println("Entre com os elementos da matriz: ");

        for (int i = 0; i < matrix.length; i++) { // N: no. de linhas: matrix.length

            for (int j = 0; j < matrix[i].length; j++) { // N: colunas: matrix[i].length

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(matrix));

        System.out.println();
        System.out.println("Entre com um número pertencente à matriz: ");

        int x = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) { // N: no. de linhas: matrix.length

            for (int j = 0; j < matrix[i].length; j++) { // N: colunas: matrix[i].length

                if ( matrix[i][j] == x) {

                    System.out.println("Position: " + "[" + i + ", " + j + "]");

                    if ( (j - 1) >= 0) {
                        System.out.println("Left: " + matrix[i][j-1]);
                    }
                    if ( (j + 1) < matrix[i].length ) {
                        System.out.println("Right: " + matrix[i][j+1]);
                    }
                    if ( (i - 1) >= 0 ) {
                        System.out.println("Up: " + matrix[i-1][j]);
                    }
                    if ( (i + 1) < matrix.length) {
                        System.out.println("Down: " + matrix[i+1][j]);
                    }


                }
            }
        }






        sc.close();
    }
}
