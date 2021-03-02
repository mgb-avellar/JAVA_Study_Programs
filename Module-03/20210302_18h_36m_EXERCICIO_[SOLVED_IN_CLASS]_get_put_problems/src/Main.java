import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Integer> myInts = Arrays.asList(1, 2, 3, 4);
        List<Double> myDoubles = Arrays.asList(3.14, 6.28);
        List<Object> myObjs = new ArrayList<Object>();

        copy(myInts, myObjs);
        printList(myObjs);
        System.out.println();
        copy(myDoubles, myObjs);
        printList(myObjs);

        System.out.println("Usando copy2");
        System.out.println();
        copy2(myInts, myObjs);
        printList(myObjs);
        System.out.println();
        copy2(myDoubles, myObjs);
        printList(myObjs);

    }

    public static void copy(List<? extends Number> source, List<? super Number> destiny) {

        /*
        O 'copy' recebe uma lista que pode ser Number ou que extenda Number e copia essa
        lista para uma lista de Number ou que seja um super tipo de Number (nesse caso, Object).

         */

        for(Number number : source) {
            destiny.add(number);
        }
    }

    public static void copy2(List<? extends Number> source, List<Object> destiny) {

        /*
        O 'copy' também pode ser escrito dessa maneira.
        No entanto, note que essa forma de escrever só funciona porque sabemos qual é o
        supertipo de Number. Em problemas mais genéricos, o meio mais seguro é escrever
        'copy' como fizemos no primeiro exemplo.
         */

        for(Number number : source) {
            destiny.add(number);
        }
    }



    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }


}
