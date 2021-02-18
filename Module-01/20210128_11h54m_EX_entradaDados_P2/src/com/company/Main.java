package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Aqui, queremos ler um texto até a quebra de linha (o enter)

        Scanner sc = new Scanner(System.in);

        String a1, b1, c1;

        System.out.println("Digite as frases:");

        a1 = sc.nextLine();
        b1 = sc.nextLine();
        c1 = sc.nextLine();

        System.out.println();

        System.out.println("Voce digitou: ");
        System.out.println(a1);
        System.out.println(b1);
        System.out.println(c1);

        System.out.println();

        // Agora, se voce usar outro "next" que nao seja o nextLine() antes de algum nextLine()
        //   aparece o problema da quebra de linha pondente, que sera entao consumido pelo
        //   nextLine() seguinte, gerando uma string (um caractere na verdade) vazio

        int x;
        String a2, b2, c2;

        System.out.println("Digite um inteiro e depois as frases:");

        x = sc.nextInt();
        a2 = sc.nextLine();
        b2 = sc.nextLine();
        c2 = sc.nextLine();

        System.out.println();

        System.out.println("Voce digitou: ");
        System.out.println(x);
        System.out.println(a2);
        System.out.println(b2);
        System.out.println(c2);

        System.out.println();

        // Para evitar o problema acima, coloque um nextLine() sozinho depois
        //    do "next" que nao eh "line"

        int y;
        String a3, b3, c3;

        System.out.println("Digite um inteiro e depois as frases:");

        y = sc.nextInt();
        sc.nextLine();
        a3 = sc.nextLine();
        b3 = sc.nextLine();
        c3 = sc.nextLine();

        System.out.println();

        System.out.println("Voce digitou: ");
        System.out.println(y);
        System.out.println(a3);
        System.out.println(b3);
        System.out.println(c3);

        System.out.println();

        sc.close();

    }
}
