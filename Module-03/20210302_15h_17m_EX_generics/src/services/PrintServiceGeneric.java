package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceGeneric<T> {

    // Esta classe é mais geral, mas ainda não é a melhor implementação de generics

    private List<T> list = new ArrayList<>();

    public void addValue(T value) {

        list.add(value);
    }

    public T first() {

        return list.get(0);
    }

    public T fourth() {

        return list.get(3);
    }

    public void print() {

        // Defensive programming
        if (list.isEmpty()) {

            throw new IllegalStateException("The list is empty.");
        }
        else {

            System.out.print("[" + list.get(0));

            for (int i = 1; i < list.size(); i++) {
                System.out.print(", " + list.get(i));
            }

            System.out.println("]");
        }


    }
}
