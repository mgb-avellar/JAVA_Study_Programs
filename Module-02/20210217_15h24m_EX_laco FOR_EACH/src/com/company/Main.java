package com.company;

public class Main {

    public static void main(String[] args) {

        String[] vect =  new String[] {"Maria", "Bob", "Alex"};

        for (int i = 0; i < vect.length; i++) {

            System.out.println(vect[i]);
        }

        System.out.println("---------");

        // Alternativamente, com o laço FOR EACH

        for (String obj : vect){  // String: tipo; obj: apelido; vect: a coleção a ser percorrida

            System.out.println(obj);
        }




    }
}
