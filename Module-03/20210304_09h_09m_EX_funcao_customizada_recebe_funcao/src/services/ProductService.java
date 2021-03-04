package services;

import entities.Product;

import java.util.List;

public class ProductService {

    public double filteredSum(List<Product> list) {

        double sum = 0.0;

        for (Product p : list) {

            if (p.getProductName().charAt(0) == 'T') {

                sum += p.getProductPrice();
            }
        }

        return sum;

        /*
        O problema com essa construção é que minha função depende da condição que está
        dentro do 'if': p.getProductName().charAt(0) == 'T'.
        Se eu quiser mudar a condição, preciso acessar essa classe, ProductService,
        e fazer alterações, o que não é boa prática se pensarmos em manutenção a longo
        prazo.
        Seria mais interessante se eu pudesse criar uma função com a condição e
        passar essa função ao método, que por sua vez, passaria ao 'if'.

        public double filteredSum(List<Product> list, ????) {
            ...
            if (???) { ...

        Essa condição ???, que é um predicado do tipo product, poderia estar no Main.
         */
    }
}
