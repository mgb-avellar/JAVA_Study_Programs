package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println("Entre com um inteiro representando o numero de repeticoes:");

        int N = sc.nextInt();

        int soma = 0;

        for (int i = 0; i < N; i++) {

            System.out.println("Entre com um inteiro: ");
            int x = sc.nextInt();

            soma += x;
        }

        System.out.println("A some dos N inteiros eh: " + soma);

        sc.close();
    }
}
