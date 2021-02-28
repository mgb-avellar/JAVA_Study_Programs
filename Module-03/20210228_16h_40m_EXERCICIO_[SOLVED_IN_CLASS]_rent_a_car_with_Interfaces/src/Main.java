import model.entities.CarRental;
import model.entities.Vehicle;
import model.services.BrazilTaxService;
import model.services.RentalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        System.out.println("Enter rental data: ");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pickup (dd/MM/yyyy hh:mm): ");
        Date start = sdf.parse(sc.nextLine());
        System.out.print("Return (dd/MM/yyyy hh:mm): ");
        Date finish = sdf.parse(sc.nextLine());

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter price per hour: ");
        double pricePerHour = sc.nextDouble();

        System.out.print("Enter price per day: ");
        double pricePerDay = sc.nextDouble();

        // Instanciação do serviço (note que no uso da Interface, não preciso mudar o 'new BrazilTaxService()',
        //   pois haverá upcasting; porém, se eu mudar para USTaxService, terei que mudar aqui)

        /*
        O que acontece aqui é que Main instancia meu objeto da classe concreta, via RentalService que recebe
        o genérico TaxService. É o que chamamos de Injeção de Dependência por meio de Construtor.
         */

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        // Acesso meu serviço de aluguel e chamo a operação processInvoice, passando meu objeto carRental
        rentalService.processInvoice(cr);

        System.out.println("INVOICE: ");
        System.out.println("Basic payment: " + String.format("%.2f", cr.getInvoice().getBasicPayment()));
        System.out.println("Tax payment: " + String.format("%.2f", cr.getInvoice().getTax()));
        System.out.println("Total payment: " + String.format("%.2f", cr.getInvoice().getTotalPayment()));

        sc.close();

    }
}
