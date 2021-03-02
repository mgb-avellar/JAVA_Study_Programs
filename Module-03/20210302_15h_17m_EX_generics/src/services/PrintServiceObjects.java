package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceObjects<Object> {

    // Esta classe é mais geral, mas ainda não é a melhor implementação de generics

    private List<Object> list = new ArrayList<>();

    public void addValue(Object value) {

        list.add(value);
    }

    public Object first() {

        return list.get(0);
    }

    public Object fourth() {

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
