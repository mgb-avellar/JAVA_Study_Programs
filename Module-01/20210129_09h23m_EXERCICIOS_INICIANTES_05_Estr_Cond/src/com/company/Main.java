package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 05

           Com base na tabela do PDF, escreva um programa que leia o código de um item e a quantidade deste item. A
              seguir, calcule e mostre o valor da conta a pagar.

        */

        Locale.setDefault(Locale.US);

        int cod_prod, qtd_prod;
        double preco_unt_prod;

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o codigo do produto e com a quantidade requerida (inteiros): ");

        cod_prod = sc.nextInt();
        qtd_prod = sc.nextInt();

        if ( cod_prod == 1) {

            preco_unt_prod = 4.00;
            System.out.printf("Total: R$ %.2f", preco_unt_prod * qtd_prod);

        }
        else if ( cod_prod == 2) {

            preco_unt_prod = 4.50;
            System.out.printf("Total: R$ %.2f", preco_unt_prod * qtd_prod);
        }
        else if ( cod_prod == 3) {

            preco_unt_prod = 5.00;
            System.out.printf("Total: R$ %.2f", preco_unt_prod * qtd_prod);
        }
        else if ( cod_prod == 4) {

            preco_unt_prod = 2.00;
            System.out.printf("Total: R$ %.2f", preco_unt_prod * qtd_prod);
        }
        else if ( cod_prod == 5) {

            preco_unt_prod = 1.50;
            System.out.printf("Total: R$ %.2f", preco_unt_prod * qtd_prod);
        }
        else {

            System.out.println("Codigo de produto inexistente.");
        }

        System.out.println();
        sc.close();

    }
}
