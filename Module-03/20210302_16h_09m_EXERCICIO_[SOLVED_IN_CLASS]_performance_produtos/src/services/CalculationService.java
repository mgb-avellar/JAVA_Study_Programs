package services;

import java.util.List;

public class CalculationService {

    public static < T extends Comparable<T> > T max(List<T> list) {
        if (list.isEmpty()) {
            throw new IllegalStateException("List can't be empty");
        }
        T max = list.get(0);
        for (T item : list) {
            if (item.compareTo(max) > 0) {
                max = item;
            }
        }
        return max;

        /*
        <T extends Comparable<T> > serve para dois propósitos:
        1. a parte <T ...> serve para parametrizar o método com o tipo T, dado que a classe não é parametrizada
        2. a parte <... extends Comparable<T> > serve para podermos usar o 'compareTo', estendendo a classe
           Comparable

        Inclusive, preciso fazer a classe Product no pacote entities implementar Comparable (vide product)

        O correto mesmo seria declarar:

        <T extends Comparable<? super T> >

        No entanto, veremos isso mais para frente no curso.

         */
    }
}