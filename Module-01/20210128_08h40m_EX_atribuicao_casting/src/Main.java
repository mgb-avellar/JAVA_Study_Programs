public class Main {

    public static void main(String[] args){

        System.out.println();

        int x1, y1;

        x1 = 5;
        y1 = 2 * x1;
        System.out.println("x1 e y1: " + x1 + " " + y1);

        int x2;
        double y2;

        x2 = 5;
        y2 = 2 * x2;
        System.out.println("x2 e y2: " + x2 + " " + y2);

        double b1, B1, h1, area1;

        b1 = 6.0;
        B1 = 8.0;
        h1 = 5.0;

        area1 = (b1 + B1) / 2.0 * h1;

        System.out.println("Area1: " + area1);

        float b2, B2, h2, area2;

        b2 = 6f;
        B2 = 8f;
        h2 = 5f;

        area2 = (b2 + B2) / 2f * h2;

        System.out.println("Area2: " + area2);

        int p1, q1;
        double resultado1;

        p1 = 5;
        q1 = 2;

        resultado1 = p1 / q1;

        System.out.println("Resultado1: " + resultado1);

        resultado1 = (double) p1 / q1;                      // Casting!

        System.out.println("Resultado1: " + resultado1);

        double p2;
        int q2;

        p2 = 5.0;
        // q2 = p2;                                            // Isso dá erro. Corrigido na linha de baixo.

        q2 = (int) p2;                                         // Casting.

        System.out.println("q2: " + q2);



    }
}
