import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(3, 4, 5, 10, 7);

        Stream<Integer> st1 = list.stream();  // crio uma stream a partir da lista acima

        System.out.println("st1: " + Arrays.toString(st1.toArray()));

        st1 = list.stream().map(x -> x * 10);

        System.out.println("st1 * 10: " + Arrays.toString(st1.toArray()));

        System.out.println();

        Stream<String> st2 = Stream.of("Maria", "Alex", "Bob");

        System.out.println("st2: " + Arrays.toString(st2.toArray()));

        System.out.println();

        Stream<Integer> st3 = Stream.iterate(0, x -> x + 2);

        System.out.println("st3 (first 10 elements): " + Arrays.toString(st3.limit(10).toArray()));

        System.out.println();

        Stream<Long> st4 = Stream.iterate(new long[]{ 0L, 1L }, p->new long[]{ p[1], p[0]+p[1] }).map(p -> p[0]);
        // o 'map' acima leva o par criado para um elemento só gerando elementos em sequência

        System.out.println("st4 (first 10 elements of the Fibonacci sequence): " + Arrays.toString(st4.limit(10).toArray()));


    }
}
