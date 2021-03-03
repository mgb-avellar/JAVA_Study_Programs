package entities;

public class Product {

    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // Para a versão 2: Crio um método estático que recebe um produto e devolve um booleano

    //public static boolean staticProductPredicate (Product product) {
    //    return product.getPrice() >= 100.0;
    //}

    // Para versão 3: mesmo método acima, porém não estático

    public boolean nonStaticProductPredicate () {
        return this.price >= 100.0;
        /*
        PS: método estático trabalha com o argumento que passarmos para ele.
            método não estático com o próprio objeto onde estou, ou seja, aqui, (this.) price
         */
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + String.format("%.2f", price) + "]";
    }
}
