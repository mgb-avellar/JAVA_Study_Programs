package com.company;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        }
        catch (InputMismatchException e) {
            System.out.println("Input type error!");
        }

        System.out.println("Fim do programa.");

        sc.close();
    }
}
