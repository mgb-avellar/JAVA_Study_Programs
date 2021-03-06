package entities;

public class Product {

    public String name;
    public double price;
    public int quantity;

    public double totalValueInStock () {

        return price * quantity;
    }

    public void addProducts (int quantity) {

        this.quantity += quantity;      // por causa da qmbiguidade
                                        //   entre o atributo da classe
                                        //   (public int quantity) e o
                                        //   argumento que a funcao recebe,
                                        //   uso a keyword this.

    }

    public void removeProducts (int quantity) {

        this.quantity -= quantity;
    }

    /* Toda classe é subclasse da classe Object.
       Por isso, quando declaramos a variavel product no Main,
         aparecia outras coisas alem das variaveis e metodos da classe
         Product; sao as heranças da classe Object.
       A classe object tem um metodo chamado toString(), que podemos usar
         ou sobrescrever. Abaixo, sobrescreveremos o toString() da Object
         para que se adeque melhor aos nossos propositos.

    */
    public String toString() {

        return name
                + ", $ "
                + String.format("%.2f", price)
                + ", "
                + quantity
                + " units, Total $ "
                + String.format("%.2f",totalValueInStock());
    }
}
