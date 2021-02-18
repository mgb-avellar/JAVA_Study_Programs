package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // entrar tres numeros e retornar o maior deles

        Scanner sc = new Scanner(System.in);

        int x, y, z;

        System.out.println();
        System.out.println("Entre com os 3 numeros:");

        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();

        int maior = max(x, y, z);

        showResult(maior);

        sc.close();

    }

    public static int max(int a, int b, int c) {

        // public: para que esta funcao fique disponivel em outras classes
        // static: para que a funcao possa ser chamada independentemente de se criar um objeto
        // int: o tipo de retorno que a funcao prove (neste caso o maior dentre os tres inteiros)

        int aux; // variavel local, so existe no escopo dessa funcao

        if ( a > b && a > c ) {

            aux = a;
        }
        else if ( b > c ) {

            aux = b;
        }
        else {

            aux = c;
        }

        return aux;

    }

    public static void showResult(int number) {

        System.out.println("Maior = " + number);
    }


}
