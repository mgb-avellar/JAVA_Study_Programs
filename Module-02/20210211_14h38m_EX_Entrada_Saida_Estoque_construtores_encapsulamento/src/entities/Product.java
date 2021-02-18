package entities;

public class Product {

    // Escapsulamento dos atributos: substituo o public por private
    private String name;
    private double price;
    private int quantity;

    // Construtores são criados geralmente depois dos atributos

    public Product (String name, double price, int quantity) {

        this.name = name;
        this.price = price;
        this.quantity = quantity;

        // O contrutor é obrigado a receber os parâmetros e atribuí-los aos atributos da classe Product
        // Note que o contrutor não tem tipo de retorno: não há nada entre o public e o nome do construtor
    }

    // Abaixo, a sobrecarga do construtor, sem quantity como argumento
    public Product (String name, double price) {

        this.name = name;
        this.price = price;
        // this.quantity = 0; Essa linha não é necessária.

    }

    // Também é possível criar ou manter um contrutor padrão para eventualidades

    public Product () {

    }

    // Note que ele é vazio.

    // Getters e Setters são métodos colocados geralmente depois dos construtores.

    // Getters permitem que o Main acesse a variável para obter alguma informação;
    // Setters permitem que o Main modifique a infirmação contida no atributo.

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Não criaremos get para quantity, pois nosso programa só permite que
    // quantity seja alterado via métodos para adicionar ou remover (abaixo)

    public double totalValueInStock () {

        return price * quantity;
    }

    public void addProducts (int quantity) {

        this.quantity += quantity;      // por causa da ambiguidade
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
