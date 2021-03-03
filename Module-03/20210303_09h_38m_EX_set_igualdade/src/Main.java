import entities.Product;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();
        set.add(new Product("TV", 900.0));
        set.add(new Product("Notebook", 1200.0));
        set.add(new Product("Tablet", 400.0));
        Product prod = new Product("Notebook", 1200.0);
        System.out.println(set.contains(prod));

        /*
        Sem a imlementação do hashCode e equals na classe Product,
        o comando 'set.contains(prod)' retornará 'false', pois a
        comparação é por referência do ponteiro, não pelo conteúdo.
        (a instância de 'prod' em 'Product prod ...' gera um objeto
        diferente daquela em 'set.add(...)'. )
         */

        Set<Product> set2 = new TreeSet<>();
        set2.add(new Product("TV", 900.0));
        set2.add(new Product("Notebook", 1200.0));
        set2.add(new Product("Tablet", 400.0));

        /*
        Rodar o código do jeito que está, com TreeSet dará erro, pois o Comparable não está
        implementado em Product. Precisamos fazer Produc implementar o Comparable.
         */

        for(Product p : set2) {

            System.out.println(p);
        }

    }
}
