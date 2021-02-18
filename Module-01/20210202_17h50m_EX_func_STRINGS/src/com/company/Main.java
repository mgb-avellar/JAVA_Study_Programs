package com.company;

public class Main {

    public static void main(String[] args) {

        // funcoes uteis com strings

        String original = "  abcde FGHIJ ABC abc DEFG        ";
        String s01 = original.toLowerCase();
        String s02 = original.toUpperCase();
        String s03 = original.trim();
        String s04 = original.substring(2);
        String s05 = original.substring(2, 9);
        String s06 = original.replace('a', 'x');
        String s07 = original.replace("abc", "xy");
        int i = original.indexOf("bc");
        int j = original.lastIndexOf("bc");

        System.out.println();

        System.out.println("Original: -" + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-"); // nova string a partir da posicao 2
        System.out.println("substring(2, 9): -" + s05 + "-"); // nova string entre as posicoes 2 e 9
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'xy'): -" + s07 + "-");
        System.out.println("Index of 'bc': " + i); // posicao da 1a ocorrencia de bc
        System.out.println("Last index of 'bc': " + j); // posicao da ultima ocorrencia de bc

        System.out.println();

        String s = "potato apple lemon";

        String[] vect = s.split(" "); // separa a string por espaços
        String w1 = vect[0];
        String w2 = vect[1];
        String w3 = vect[2];

        System.out.println("w1 " + w1);
        System.out.println("w2 " + w2);
        System.out.println("w3 " + w3);

    }
}
