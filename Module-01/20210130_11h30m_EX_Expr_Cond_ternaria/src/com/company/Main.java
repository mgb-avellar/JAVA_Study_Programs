package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*  Testa uma condicao. Sintaxe:

            ( condicao ) ? valor_se_verdadeira : valor_se_falsa

            Ou seja, se a condicao for verdadeira, imprime o primeiro valor (depois da ?);
               se a condicao for falsa, imprime o segundo valor (depois dos :).

            Equivale a uma estrutura if-else unica (sem else-if)

        */

        Locale.setDefault(Locale.US);
        double preco;
        double desconto;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o preco: ");

        preco = sc.nextDouble();

        desconto = ( preco < 20 ) ? preco * 0.1 : preco * 0.05;

        System.out.println("Valor do desconto = R$ " + desconto);


    }
}
