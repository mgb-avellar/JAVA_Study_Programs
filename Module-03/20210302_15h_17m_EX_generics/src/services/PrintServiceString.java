package services;

import java.util.ArrayList;
import java.util.List;

public class PrintServiceString<String> {

    private List<String> list = new ArrayList<>();

    public void addValue(String value) {

        list.add(value);
    }

    public String first() {

        return list.get(0);
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
