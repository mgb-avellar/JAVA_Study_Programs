import services.PrintServiceGeneric;
import services.PrintServiceInteger;
import services.PrintServiceObjects;

import java.util.Scanner;

public class Main {

    public static void main(String[]  args) {

        Scanner sc =  new Scanner(System.in);

        System.out.println();

        PrintServiceInteger<Integer> intList = new PrintServiceInteger<>();

        System.out.print("How many items? ");
        int n = sc.nextInt();

        System.out.printf("Enter %d values: ", n);

        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();
            intList.addValue(value);
        }

        System.out.println();

        intList.print();

        System.out.println("First: " + intList.first());

        // ===============

        PrintServiceInteger<String> stringList = new PrintServiceInteger<>();

        sc.nextLine();
        System.out.println();
        System.out.printf("Enter %d names: ", n);

        for (int i = 0; i < n; i++) {

            String names = sc.next();
            stringList.addValue(names);
        }

        System.out.println();

        stringList.print();

        System.out.println("First: " + stringList.first());

        // ===============

        PrintServiceObjects<Object> objList = new PrintServiceObjects<>();

        sc.nextLine();
        System.out.println();
        System.out.printf("Enter %d names: ", n);

        for (int i = 0; i < n; i++) {

            String names = sc.next();
            objList.addValue(names);
        }

        System.out.println();
        System.out.printf("Now enter %d values: ", n);

        for (int i = 0; i < n; i++) {

            int values = sc.nextInt();
            objList.addValue(values);
        }

        System.out.println();

        objList.print();

        System.out.println("First: " + objList.first());
        System.out.println("Fourth: " + objList.fourth());

        // O problema de Object é o type safety:

        // Integer x = objList.first(); // Isso dá erro, pois o primeiro elemento é string

        // Precisamos de uma classe genérica:


        // ===============

        // Agora posso classes específicas sem medo. No entanto, não posso ter
        //   listas mistas como no caso acima.
        PrintServiceGeneric<String> genListString = new PrintServiceGeneric<>();

        sc.nextLine();
        System.out.println();
        System.out.printf("Enter %d names: ", n);

        for (int i = 0; i < n; i++) {

            String names = sc.next();
            genListString.addValue(names);
        }

        System.out.println();

        genListString.print();
        System.out.println("First: " + genListString.first());

        PrintServiceGeneric<Integer> genListInt = new PrintServiceGeneric<>();

        System.out.println();
        System.out.printf("Now enter %d values: ", n);

        for (int i = 0; i < n; i++) {

            int values = sc.nextInt();
            genListInt.addValue(values);
        }

        System.out.println();

        genListInt.print();

        System.out.println("First: " + genListInt.first());

    }
}
