package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // compara duas variaveis bit a bit
        // no exemplo, queremos saber se o sexto bit de um numero entrado pelo usuario eh 1
        // usaremos como exemplo o 89 (01011001) e o 113 (01110001)
        // os operadores bitwise sao & (and), | (or) e ^ (xor)

        Scanner sc = new Scanner(System.in);

        int n;
        int mask = 0b00100000; // numero binario cujo sexto bit eh 1 (equiv 32 em decimal);
                               // 0b indica que estamos escrevendo em binario

        System.out.println("Entre com um inteiro");

        n = sc.nextInt();

        if ( (n & mask) != 0  ) {

            System.out.println("6th bit is true, i.e., is 1.");
        }
        else {

            System.out.println("6th bit is false, i.e., is 0.");
        }

    }
}
