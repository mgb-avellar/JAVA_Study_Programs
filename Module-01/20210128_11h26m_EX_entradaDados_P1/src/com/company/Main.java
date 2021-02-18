package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Entrando uma string

        Scanner sc1 = new Scanner(System.in);

        String x1;

        System.out.println("Entre com a string:");

        x1 = sc1.next();

        System.out.println("Voce digitou: " + x1);

        // Entrando um inteiro

        Scanner sc2 = new Scanner(System.in);

        int x2;

        System.out.println("Entre com o inteiro:");

        x2 = sc2.nextInt();

        System.out.println("Voce digitou: " + x2);

        // Entrando um double

        Scanner sc3 = new Scanner(System.in);

        double x3;

        System.out.println("Entre com o inteiro com separador decimal virgula (se for ponto dara erro, pois nao foi usado o Locale antes):");

        x3 = sc3.nextDouble();

        System.out.println("Voce digitou (note que o println usa automaticamente o Locale.US): " + x3);

        System.out.printf("Voce digitou (note que o printf usa o Locale da máquina): %.2f \n", x3);

        System.out.println();

        // Entrando um double com Locale.US setado antes

        Locale.setDefault(Locale.US);

        Scanner sc4 = new Scanner(System.in);

        double x4;

        System.out.println("Entre com o inteiro com separador decimal ponto (se for virgula dara erro, pois nao foi usado o Locale antes):");

        x4 = sc4.nextDouble();

        System.out.println("Voce digitou (note que o println imprimiu usando o Locale.US, o que ja fazia mesmo): " + x4);

        System.out.printf("Voce digitou (note que o printf agora uso o Locale que definimos antes de Scanner): %.2f \n", x4);

        System.out.println();

        // Entrando um char

        Scanner sc5 = new Scanner(System.in);

        char x5;

        System.out.println("Entre com um ou mais caracteres (o comando de entrada pegará apenas o primeiro, pois a variavel eh um char):");

        x5 = sc5.next().charAt(0);

        System.out.println("Voce digitou: " + x5);

        System.out.println();

        // Entrando varios dados na mesma linha

        Scanner sc6 = new Scanner(System.in);

        String a;

        int b;

        double c;

        System.out.println("Entre com os dados: ");

        a = sc6.next();
        b = sc6.nextInt();
        c = sc6.nextDouble();

        // Note que posso usar o mesmo sc6.

        System.out.println("Voce digitou: " + a + " " + b + " " + c);




    }
}
