import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        Resolver o problema do triangulo usando orientacao a objetos.

         */

        /*

        OBS: aqui eu não usei o template. Criei um package chamado entities, dentro do qual
             coloquei minha classe Triangle. (botão direito sobre src e criate new package.)

             Note que o IntelliJ importa a classe: import entities.Triangle;

         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Entre com as medidas do triangulo X:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Entre com as medidas do triangulo Y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.area();

        double areaY = y.area();

        System.out.printf("Area do triangulo X: %.4f \n", areaX);
        System.out.printf("Area do triangulo Y: %.4f \n", areaY);

        if ( areaX > areaY) {
            System.out.println("Triangulo X tem area maior");
        }
        else {
            System.out.println("Triangulo Y tem area maior");
        }

        sc.close();
    }
}
