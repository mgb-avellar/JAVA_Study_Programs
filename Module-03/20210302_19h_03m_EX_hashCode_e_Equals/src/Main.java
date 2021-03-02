import entities.Client;

public class Main {

    public static void main(String[] args) {

        Client c1 = new Client("Maria", "maria@gmail.com");
        Client c2 = new Client("Alex", "alex@gmail.com");
        Client c3 = new Client("Maria", "maria2@gmail.com");
        Client c4 = new Client("Maria", "maria@gmail.com");

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c4));

        System.out.println((c1 == c4) + " Isso acontece porque o == compara referências de memória, não conteúdo");

        /*
        Se quisermos comparar dois objetos pelo conteúdo, é melhor darmos preferência
        para o equals.
         */

        String s1 = "test";
        String s2 = "test";

        System.out.println((s1 == s2) + " Nesse caso dá igual porque o compilador dá tratamento especial literal.");

        String s3 = new String("test");
        String s4 = new String("test");

        System.out.println((s3 == s4) + " Nesse caso dá diferente pelo mesmo motivo da questão das referências; são objetos diferentes.");

    }
}
