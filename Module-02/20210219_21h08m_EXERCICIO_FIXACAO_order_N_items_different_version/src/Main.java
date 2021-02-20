import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        /*
            Ler os dados de um pedido com N itens (N fornecido pelo usuário). Depois, mostrar um
sumário do pedido conforme exemplo (próxima página). Nota: o instante do pedido deve ser
o instante do sistema: new Date()

Enter cliente data:
Name: Alex Green
Email: alex@gmail.com
Birth date (DD/MM/YYYY): 15/03/1985
Enter order data:
Status: PROCESSING
How many items to this order? 2
Enter #1 item data:
Product name: TV
Product price: 1000.00
Quantity: 1
Enter #2 item data:
Product name: Mouse
Product price: 40.00
Quantity: 2
ORDER SUMMARY:
Order moment: 20/04/2018 11:25:09
Order status: PROCESSING
Client: Alex Green (15/03/1985) - alex@gmail.com
Order items:
TV, $1000.00, Quantity: 1, Subtotal: $1000.00
Mouse, $40.00, Quantity: 2, Subtotal: $80.00
Total price: $1080.00

         */

        /*
            A solução é como no caso do trabalhador com N contratos.
            Vou usar também o StringBuilder

         */

        /*

        NESSA VERSÃO, MEU OBJETO ORDER NÃO TEM O ATRIBUTO orderItemPrice COMO SUGERIDO NO ENUNCIADO DO EXERCÍCIO
        E IMPLEMENTADO NA PRIMEIRA VERSÃO DESSE EXERCÍCIO (20210219_17h40m_EXERCICIO_FIXACAO_order_N_items).
        O MOTIVO É QUE ESSE ATRIBUTO JÁ É FORNECIDO AO OBJETO PRODUCT E POSSO USÁ-LO PARA OBTER O PREÇO.
        COMO NA VERSÃO ORIGINAL OrderItem RECEBIA O PREÇO E O OBJETO PRODUTO (QUE JÁ TEM O PREÇO), ACABOU
        QUE FORNECER O PREÇO A OrderItem FICOU REDUNDANTE.

        PORÉM, NESSA VERSÃO EU POSSO FICAR SEM UM HISTÓRICO DE PREÇOS.

        A razão para eu repetir o preço em OrderItem é que assim eu mantenho o histórico dos preços.
        Se, por ventura, o preço do produto mudar, ele será mudado na instanciação
        do produto em si, mas o preço antigo permanecerá na lista.

        Na versão como está, não tenho essa capacidade.

     */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        // Entro com os dados do cliente e instancio o objeto cliente (Client)

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());

        Client client = new Client(name, email, birthDate);

        // =====================================================================

        // Entro com o status da ordem e instancio o objeto enumerado OrderStatus

        System.out.println("Enter order data:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        // ======================================================================

        // Instancio o objeto ordem (Order), que recebe a data do sistema (new Date()), o status e o cliente

        Order order = new Order(new Date(), status, client);

        // ======================================================================

        // Digo quantos produtos diferente eu quero em minha lista

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        // =======================================================================

        // Para cada produto, entro com o nome do produto desejado e seu preço, e instancio o objeto produto (Product)

        for (int i=1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();

            Product product = new Product(productName, productPrice);

            // ===================================================================

            // Digo a quantidade desse produto específico que quero comprar, por exemplo, 3 TVs.

            System.out.print("Quantity: ");
            int quantity = sc.nextInt();

            // ===================================================================

            // Com as informações sobre o produto e sobre a quantidade, instancio o item da ordem (OrderItem)

            OrderItem orderItem = new OrderItem(quantity, product);

            // ====================================================================

            // Adiciono o item da ordem na lista da ordem

            order.addItem(orderItem);

            // ====================================================================
        }

        System.out.println();
        System.out.println("ORDER SUMMARY:");
        System.out.println(order);


        sc.close();
    }



}
