import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Main {

    public static void main(String[] args) {

        /*
        Vamos usar as funcionalidades do github para fazer o projeto primeiramente
        usando o conceito de herança. Faremos um commit e depois modificaremos o
        projeto para refazê-lo usando o conceito de interface.

        Neste projeto não é possível ter uma classe ComboDevice que herda funcionalidades
        de ConcretePrinter e ConcreteScanner.
         */

        System.out.println();
        ConcretePrinter p = new ConcretePrinter("1080");
        p.processDoc("My Letter");
        p.print("My Letter");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("2003");
        s.processDoc("My Email");
        System.out.println("Scan result: " + s.scan());


    }
}
