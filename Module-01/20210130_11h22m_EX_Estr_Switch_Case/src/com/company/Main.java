package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // modo mais economico, porem equivalente, de varios if-else encadeados

        Scanner sc = new Scanner(System.in);
        int num;
        String dia;

        System.out.println("Digite um numero inteiro:");

        num = sc.nextInt();

        switch (num) {

            case 1:
                dia = "domingo";
                break;
            case 2:
                dia = "segunda";
                break;
            case 3:
                dia = "terca";
                break;
            case 4:
                dia = "quarta";
                break;
            case 5:
                dia = "quinta";
                break;
            case 6:
                dia = "sexta";
                break;
            case 7:
                dia = "sabado";
                break;
            default:
                dia = "valor invalido";
                break;
        }

        System.out.println("Dia da semana: " + dia);
        sc.close();

    }
}
