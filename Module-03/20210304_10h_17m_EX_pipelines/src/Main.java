import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream().map(x -> x * 10);

        System.out.println("st1: " + Arrays.toString(st1.toArray()));

        int sum = list.stream().reduce(0, (x, y) -> x + y);
        // reduce toma dois argumentos: um elemento primeiro e uma função que pega dois
        //   elementos e fornece um resultado. Note que o primeiro elemento é a identidade
        //   da soma, 0.

        System.out.println("Sum = " + sum);

        int prod = list.stream().reduce(1, (x, y) -> x * y);
        // Fazendo a produtória: note que o primeiro elemento é a identidade da
        //   multiplicação, 1.

        System.out.println("Prod = " + prod);

        /*
        A seguir, criarei uma lista de inteiros a partir da anterior, apenas
        com os números pares, e multiplicando essa lista de pares por 10.
        O processo cria uma stream atualizada a cada passo intermediário
        e no fim transformo em lista novamente
         */
        List<Integer> newList = list.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 10)
                .collect(Collectors.toList());

        System.out.println();
        System.out.println("New list: " + Arrays.toString(newList.toArray()));

    }
}
