import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Shape> myShapes = new ArrayList<>();

        myShapes.add(new Rectangle(3.0,2.0));
        myShapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(myShapes));

        /*
        Se eu criar uma lista de Circles e tentar usar o método totalArea, dará erro de casting:

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        System.out.println("Total area: " + totalArea(myCircles)); <=== ERROR!

        O motivo é que a list<Shape> não é super lista de List<Circle>.

        Para permitir que meu método aceite qualquer tipo de Shape, devo mudar a
        definição do cabeçalho do meu método.

         */

        List<Circle> myCircles = new ArrayList<>();
        myCircles.add(new Circle(2.0));
        myCircles.add(new Circle(3.0));
        System.out.println("Total area: " + totalArea(myCircles));

    }

    // public static double totalArea(List<Shape> list) {
    public static double totalArea(List<? extends Shape> list) {
        /*
        O '<? extends Shape>' significa que totalArea recebe uma lista de Shape ou
        qualquer forma que extenda Shape. Com isso posso usar o totalArea com
        myCircles também (veja acima).

        No entanto, o preço aqui é que uma vez recebido um tipo de lista, por exemplo,
        de retângulos, não serei capaz de adicionar um círculo, ou seja, não poderei fazer:
        list.add(new Circle(4.0));, por exemplo.
         */

        double sum = 0.0;

        for (Shape s : list) {

            sum += s.area();
        }

        return sum;
    }

}
