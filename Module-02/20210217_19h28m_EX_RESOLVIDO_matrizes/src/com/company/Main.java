package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número inteiro N e uma matriz de
                ordem N contendo números inteiros. Em seguida, mostrar a diagonal
                principal e a quantidade de valores negativos da matriz.

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter com a ordem N da matriz: ");
        int N = sc.nextInt();

        int[][] matrix = new int[N][N];

        // compare com vetores: double[] vect = new double[N];
        // ou vetor de objetos de classe criada: Rooms[] vectRooms = new Rooms[10];

        System.out.println("Entre com os valores da matriz:");
        // A leitura se dá linha a linha

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println(Arrays.deepToString(matrix));

        System.out.println();
        System.out.println("Main diagonal:");

        for (int i = 0; i < N; i++) {
            System.out.print(matrix[i][i] + " ");
        }

        System.out.println();

        int count = 0;

        for (int i = 0; i < matrix.length; i++) { // N: no. de linhas: matrix.length

            for (int j = 0; j < matrix[i].length; j++) { // N: colunas: matrix[i].length

                if ( matrix[i][j] < 0) {

                    count ++;
                }
            }
        }

        System.out.println();
        System.out.print("Quantity of negative numbers in the matrix: " + count);

        sc.close();


    }
}
