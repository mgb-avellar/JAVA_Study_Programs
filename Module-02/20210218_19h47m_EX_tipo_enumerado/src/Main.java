import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.DELIVERED);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.PROCESSING;

        OrderStatus os2 = OrderStatus.valueOf("PROCESSING");

        System.out.println("os1 " + os1);
        System.out.println("os2 " + os2);

    }
}
