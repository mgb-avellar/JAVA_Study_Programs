package com.company;

public class Main {

    public static void main(String[] args) {

        double x = 3.0;
        double y = 4.0;
        double z = -5.0;

        double A, B, C;

        A = Math.sqrt(x);
        B = Math.sqrt(y);
        C = Math.sqrt(25.0);

        System.out.println();

        System.out.println("Square root of " + x + " = " + A);
        System.out.println("Square root of " + y + " = " + B);
        System.out.println("Square root of 25.0 = " + C);

        A = Math.pow(x, y);
        B = Math.pow(x, 2.0);
        C = Math.pow(5.0, 2.0);

        System.out.println(x + " to " + y + " power = " + A);
        System.out.println(x + " to " + " the second power = " + B);
        System.out.println("5 to the second power = " + C);

        A = Math.abs(y);
        B = Math.abs(z);
        System.out.println("The modulus of " + y + " = " + A);
        System.out.println("The modulus of " + z + " = " + B);

        System.out.println();

        double a, b, c, delta, x1, x2;

        a = 2.0;
        b = 6.0;
        c = 3.0;

        delta = Math.pow(b, 2.0) - 4 * a * c;

        x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

        System.out.println(" x1 and x2 are: " + x1 + " " + x2);

        System.out.println();

    }
}
