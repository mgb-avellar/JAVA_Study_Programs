import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));

        /*
         Com a classe MyComparator, preciso mudar de Collections.sort() para
         list.sort()
         */

        //Collections.sort(list);

        /*
        Com uma classe anônima dentro do Main, não preciso mais da classe MyComparator e
        list.sort() precisa ter seu argumento atualizado
         */

        //list.sort(new MyComparator());

        /*
        Posso simplificar a classe anônima usando uma função anônima (ou lambda)
         */

        //Comparator<Product> comp = new Comparator<Product>() {
        //    @Override
        //    public int compare(Product p1, Product p2) {
        //        return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //    }
        //};

        /*
        Quando o return é de uma linha só, posso melhorar a escrita
         */

        //Comparator<Product> comp = (p1, p2) -> {
        //    return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        //};

        /*
        Consigo instanciar a função lambda diretamente em list.sort()
         */

        //Comparator<Product> comp = (p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        //list.sort(comp);

        list.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        System.out.println();

        for (Product p : list) {
            System.out.println(p);
        }


    }
}
