import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {

    public static void main(String[] args) throws ParseException {

        /*
            Fazer um programa para ler os dados de N
            produtos (N fornecido pelo usuário). Ao final,
            mostrar a etiqueta de preço de cada produto na
            mesma ordem em que foram digitados.
            Todo produto possui nome e preço. Produtos
            importados possuem uma taxa de alfândega, e
            produtos usados possuem data de fabricação.
            Estes dados específicos devem ser
            acrescentados na etiqueta de preço conforme
            exemplo (próxima página). Para produtos
            importados, a taxa e alfândega deve ser
            acrescentada ao preço final do produto.
            Favor implementar o programa conforme
            projeto ao lado.

         */

        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> productList = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Product #" + (i+1) + " data: ");
            System.out.print("Common, used or imported (c/u/i) ? ");
            char ans = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if ( ans == 'c' ) {

                Product product = new Product(name, price);
                productList.add(product);
            }
            else if ( ans == 'u' ) {

                System.out.print("Manufacture date: ");
                Date manufactureDate = sdf.parse(sc.next());

                Product product = new UsedProduct(name, price, manufactureDate);
                productList.add(product);
            }
            else if ( ans == 'i' ) {

                System.out.print("Customs fee: ");
                double customFee = sc.nextDouble();

                Product product = new ImportedProduct(name, price, customFee);
                productList.add(product);
            }

        }

        System.out.println();
        System.out.println("PRICE TAGS");

        for (Product prod : productList) {

            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
