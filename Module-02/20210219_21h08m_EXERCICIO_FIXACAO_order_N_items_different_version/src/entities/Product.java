package entities;

public class Product {

    /*
     Essa classe tem dois atributos simples: nome e preço.
     Permitirei que o preço possa ser mudado via setter, mas não o nome (preços podem ser atualizados).

     */

    private String productName;
    private Double productPrice;

    public Product(String productName, Double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Product() {

    }

    public String getProductName() {
        return productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }
}
