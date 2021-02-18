import entities.Rooms;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
           A dona de um pensionato possui dez quartos para alugar para estudantes,
        sendo esses quartos identificados pelos números 0 a 9.
        Fazer um programa que inicie com todos os dez quartos vazios, e depois
        leia uma quantidade N representando o número de estudantes que vão
        alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos
        N estudantes. Para cada registro de aluguel, informar o nome e email do
        estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
        que seja escolhido um quarto vago. Ao final, seu programa deve imprimir
        um relatório de todas ocupações do pensionato, por ordem de quarto,
        conforme exemplo.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rooms[] vectRooms = new Rooms[10];

        System.out.print("How many rooms will be rented? ");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println();

        for (int i = 0; i < N; i++) {

            System.out.printf("Room # %d: \n", i + 1);
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int room = sc.nextInt();
            sc.nextLine();

            vectRooms[room] = new Rooms(name, email);
        }

        System.out.println();
        System.out.println("Busy rooms:");

        for (int i = 0; i < vectRooms.length; i++) {

            if (vectRooms[i] != null) {

                System.out.println(i + ": " + vectRooms[i].getName() + ", " + vectRooms[i].getEmail());
            }
        }





        sc.close();
    }

}
