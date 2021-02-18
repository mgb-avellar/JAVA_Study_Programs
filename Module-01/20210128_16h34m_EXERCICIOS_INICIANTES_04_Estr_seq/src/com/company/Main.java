package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* Exercicio 04

           Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
              hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
              decimais.

        */

        Locale.setDefault(Locale.US);

        int num_func, horas_trab;
        double sal_per_hora;

        System.out.println();

        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com o numero do funcionario, as horas trabalhadas e o valor da hora trabalhada: ");

        num_func = sc.nextInt();
        horas_trab = sc.nextInt();
        sal_per_hora = sc.nextDouble();

        double salario = sal_per_hora * horas_trab;

        System.out.printf("NUMBER = %d \nSALARY = U$ %.2f \n", num_func, salario);

        sc.close();


    }
}
