package entities;

public class Product implements Comparable<Product> {

    // Para explicação do 'implementsComparable' ver classe CalculationService no pacote services

    private String productName;
    private Double productPrice;

    public Product(String name, Double price) {
        this.productName = name;
        this.productPrice = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return this.productName + ", " + String.format("%.2f", this.productPrice);
    }

    @Override
    public int compareTo(Product other) {
        /*
        A lista é uma lista de produtos, organizada do seguinte modo:
        [nome, preco, nome, preco, nome, preço, ...]

        Porém, cada item da lista é um par [nome, preço].

        Assim, preciso pegar apenas o preço de cada item para comparar e achar o maior.
         */
        return productPrice.compareTo(other.getProductPrice());
    }
}