package entities;

import entities.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

     /*
     Essa classe tem dois atributos simples: momento da ordem e seu status, e três métodos: um para adicionar
     itens, outro para remover itens e um terceiro para calcular o valor total da ordem.
     Aqui, também temos um atributo que é um objeto: precisamos de um atributo do tipo cliente. É desse
     atributo que saberemos informações sobre o comprador.
     Por fim, teremos aqui uma lista de itens.

     */

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date orderMoment;
    private OrderStatus orderStatus;

    private Client orderClient;

    private List<OrderItem> orderItemsList = new ArrayList<>();

    public Order(Date orderMoment, OrderStatus orderStatus, Client orderClient) {
        this.orderMoment = orderMoment;
        this.orderStatus = orderStatus;
        this.orderClient = orderClient;
    }

    public Order() {

    }

    public Date getOrderMoment() {
        return orderMoment;
    }

    public void setOrderMoment(Date orderMoment) {
        this.orderMoment = orderMoment;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Client getOrderClient() {
        return orderClient;
    }

    public void setOrderClient(Client orderClient) {
        this.orderClient = orderClient;
    }

    // Deixar um get aqui na lista é abrir uma porta para manipulação dela; o caso mais sério do setter
    //   eu nem pus, mas se eu quiser encapsular minha lista para protegê-la de fato, devo tirar o getter também.
    public List<OrderItem> getOrderItemsList() {
        return orderItemsList;
    }

    // Métodos

    public void addItem(OrderItem item) {

        orderItemsList.add(item);
    }

    public void removeItem(OrderItem item) {

        orderItemsList.remove(item);
    }

    public Double total() {

        double sumTotal = 0.0;

        for (OrderItem oi : orderItemsList) {

            sumTotal += oi.subTotal();
        }

        return sumTotal;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: ");
        sb.append(sdf.format(orderMoment) + "\n");
        sb.append("Order status: ");
        sb.append(orderStatus + "\n");
        sb.append("Client: ");
        sb.append(orderClient + "\n");
        sb.append("Order items:\n");
        for (OrderItem item : orderItemsList) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $");
        sb.append(String.format("%.2f", total()));
        return sb.toString();
    }

}
