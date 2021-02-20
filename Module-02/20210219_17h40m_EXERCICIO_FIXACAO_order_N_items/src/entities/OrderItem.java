package entities;

public class OrderItem {

     /*
     Essa classe tem dois atributos simples: quantidade e preço, e um método que calcula o subtotal.
     Aqui, também temos um atributo que é um objeto: precisamos de um atributo do tipo produto. É desse
     atributo que saberemos o preço do produto que é o item de escolha.

     */

    private Integer orderItemQuantity;
    private Double orderItemPrice;

    private Product product;

    public OrderItem() {

    }

    public OrderItem(Integer orderItemQuantity, Double orderItemPrice, Product product) {
        this.orderItemQuantity = orderItemQuantity;
        this.orderItemPrice = orderItemPrice;
        this.product = product;
    }

    public Integer getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public Double getOrderItemPrice() {
        return orderItemPrice;
    }

    public void setOrderItemPrice(Double orderItemPrice) {
        this.orderItemPrice = orderItemPrice;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

// Método para o cálculo do subtotal

    public double subTotal () {

        return this.orderItemQuantity * this.orderItemPrice;
    }

    public String toString() {
        return product.getProductName()
                + ", $"
                + String.format("%.2f", this.orderItemPrice)
                + ", Quantity: "
                + this.orderItemQuantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
