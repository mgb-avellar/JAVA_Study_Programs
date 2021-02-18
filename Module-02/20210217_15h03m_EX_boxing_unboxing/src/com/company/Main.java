package com.company;

public class Main {

    public static void main(String[] args) {

        int x  = 20;

        // Isso é boxing!
        Object obj = x;  // Classe Object genérica do JAVA; todas as classes são "filhas" de Object

        System.out.println("obj = " + obj);

        // Isso é unboxing
        int y = (int) obj; // Aqui, preciso do casting, para fazer o compilador entender que o tipo
                           //   é o que pensamos que seja mesmo

        System.out.println("y = " + y);

        /*
           As wrapper classes são classes correspondentes aos tipos primitivos:
           int -> Integer
           long -> Long
           float -> Float
           double -> Double
           short -> Short
           byte -> Byte
           boolean -> Boolean
           char -> Character

         */

        // Note:

        Integer obj2 = x;

        int z = obj2;  // Não preciso de casting!

        System.out.println("obj2 e z: " + obj2 + " e " + z);

        /*
           As Wrapper Classes são geralmente utilizado dentro das classes para a declaração dos
           atributos, pois podem receber o valor null por padrão, caso o valor não seja entrado.
           Ex:

           Na classe Product:

           private String name;   -> private String name;
           private double price;  -> private Double price;
           private int quantity;  -> private Integer quantity;

           No primeiro caso, se ninguém entrar quantity, por exemplo, dará erro;
           No segundo, a classe atribui null por default, e não teremos erro.



         */


    }
}
