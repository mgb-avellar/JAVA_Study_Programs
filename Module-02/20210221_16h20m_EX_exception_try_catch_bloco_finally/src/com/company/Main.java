package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Há conceitos nesse programa que veremos mais detalhadamente mais à frente no curso

        File file = new File("/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Módulo-02/text.txt");

        Scanner sc = null;

        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            System.out.println("Error opening file: " + e.getMessage());
        }
        finally {
            if (sc != null) {
                sc.close();
            }
            System.out.println("Finally block executed.");
        }

    }
}
