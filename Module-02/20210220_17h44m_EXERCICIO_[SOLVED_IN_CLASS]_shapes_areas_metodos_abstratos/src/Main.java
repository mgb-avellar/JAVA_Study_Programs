import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler os dados de N figuras (N fornecido
            pelo usuário), e depois mostrar as áreas destas figuras na
            mesma ordem em que foram digitadas.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> shapesList = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i ++) {

            System.out.print("Shape #" + (i+1) + " (r/c)? ");
            char ans = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if ( ans == 'r' ) {

                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);

                shapesList.add(shape);

            }
            else if ( ans == 'c' ) {

                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color, radius);

                shapesList.add(shape);
            }

        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape s : shapesList ) {

            System.out.println(String.format("%.2f", s.area()));

        }

        sc.close();

    }
}
