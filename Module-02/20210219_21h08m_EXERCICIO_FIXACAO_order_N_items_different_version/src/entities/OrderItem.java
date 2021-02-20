package entities;

public class OrderItem {

     /*
     Essa classe tem dois atributos simples: quantidade e preço, e um método que calcula o subtotal.
     Aqui, também temos um atributo que é um objeto: precisamos de um atributo do tipo produto. É desse
     atributo que saberemos o preço do produto que é o item de escolha.

     */

    /*
        NESSA VERSÃO, MEU OBJETO ORDER NÃO TEM O ATRIBUTO orderItemPrice COMO SUGERIDO NO ENUNCIADO DO EXERCÍCIO
        E IMPLEMENTADO NA PRIMEIRA VERSÃO DESSE EXERCÍCIO (20210219_17h40m_EXERCICIO_FIXACAO_order_N_items).
        O MOTIVO É QUE ESSE ATRIBUTO JÁ É FORNECIDO AO OBJETO PRODUCT E POSSO USÁ-LO PARA OBTER O PREÇO.
        COMO NA VERSÃO ORIGINAL OrderItem RECEBIA O PREÇO E O OBJETO PRODUTO (QUE JÁ TEM O PREÇO), ACABOU
        QUE FORNECER O PREÇO A OrderItem FICOU REDUNDANTE.

     */

    private Integer orderItemQuantity;

    private Product product;

    public OrderItem() {

    }
    public OrderItem(Integer orderItemQuantity, Product product) {
        this.orderItemQuantity = orderItemQuantity;
        this.product = product;
    }

    public Integer getOrderItemQuantity() {
        return orderItemQuantity;
    }

    public void setOrderItemQuantity(Integer orderItemQuantity) {
        this.orderItemQuantity = orderItemQuantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

// Método para o cálculo do subtotal

    public double subTotal () {

        return this.orderItemQuantity * (product.getProductPrice());
    }

    public String toString() {
        return product.getProductName()
                + ", $"
                + String.format("%.2f", product.getProductPrice())
                + ", Quantity: "
                + this.orderItemQuantity +
                ", Subtotal: $"
                + String.format("%.2f", subTotal());
    }

}
