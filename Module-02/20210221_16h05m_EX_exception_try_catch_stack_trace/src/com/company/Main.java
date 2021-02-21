package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        method1();

        System.out.println("Fim do programa.");

        System.out.println();

    }

    public static void method1() {
        System.out.println("*** METHOD1 START ***");
        method2();
        System.out.println("*** METHOD1 END ***");
    }

    public static void method2() {
        System.out.println("*** METHOD2 START ***");

        Scanner sc = new Scanner(System.in);

        try {

            System.out.println("Entre com a lista de nomes a serem armazenados no vetor: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.println("Entre com a posição no vetor para pesquisa do nome correspondente: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        }
        catch (InputMismatchException e) {
            System.out.println("Input type error!");
            e.printStackTrace();
        }

        sc.close();

        System.out.println("*** METHOD2 END ***");
    }
}
