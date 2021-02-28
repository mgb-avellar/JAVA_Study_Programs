import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PayPalService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter contract data");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Date (dd/MM/yyyy): ");
        Date date = sdf.parse(sc.next());
        System.out.print("Contract value: ");
        double totalValue = sc.nextDouble();

        // Aqui instancio um contrato
        Contract contract = new Contract(number, date, totalValue);

        // Aqui instancio o processamento do contrato, ou seja, suas parcelas (installments)
        ContractService contractService = new ContractService(new PayPalService());

        System.out.print("Enter number of installments: ");
        int numberOfInstallments = sc.nextInt();

        contractService.processContract(contract, numberOfInstallments);

        System.out.println("Installments:");
        double sum = 0.0;
        for (Installment x : contract.getInstallmentList()) {
            System.out.println(x);
            sum = sum + x.getAmount();
        }
        System.out.println("Total paid: " + sum);

        sc.close();




    }
}
