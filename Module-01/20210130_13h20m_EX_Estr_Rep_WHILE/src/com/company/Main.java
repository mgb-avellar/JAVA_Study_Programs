package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x, soma = 0;

        System.out.println("Digite numeros inteiros; digite zero para sair.");

        x = sc.nextInt();

        while ( x != 0) {

            soma += x;
            x = sc.nextInt();
        }

        System.out.println("A soma dos numeros eh: " + soma);

        sc.close();

    }
}
