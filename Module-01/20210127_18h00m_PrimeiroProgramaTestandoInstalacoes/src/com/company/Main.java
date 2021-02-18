package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        System.out.println();                       // Imprime linha em branco com quebra de linha

        System.out.println("Olá mundo!");
        System.out.println("Bom dia!");

        System.out.print("Olá mundo!");             // O print não tem quebra de linha
        System.out.println("Bom dia!");

        int y = 32;

        System.out.println(y);

        double x = 10.35784;

        System.out.println(x);

        System.out.printf("%.2f%n", x);             // %n é quebra de linha; f é ponto flutuante; .2 é # de casas decimais

        System.out.printf("%.4f%n", x);             // printf significa print formatted

        Locale.setDefault(Locale.US);               // quando quisermos formatar a saída é importante setar o Locale, principalmente por causa do separador decimal

        System.out.printf("%.4f%n", x);

        System.out.println("Resultado = " + x + " metros.");    // concatenando

        System.out.printf("Resultado = %.2f metros \n", x);     // outra forma de concatenação

        System.out.printf("Resultado = %.2f metros, mais precisamente %.4f \n", x, x);

        String nome = "Maria";

        int idade = 31;

        double renda = 4000.00;

        System.out.printf("%s tem %d e ganha R$ %.2f reais \n", nome, idade, renda);

        Locale.setDefault(new Locale("pt", "BR"));      // note que mudo o Locale conforme preciso quando imprimo com formatação

        System.out.printf("%s tem %d e ganha R$ %.2f reais \n", nome, idade, renda);
    }
}
