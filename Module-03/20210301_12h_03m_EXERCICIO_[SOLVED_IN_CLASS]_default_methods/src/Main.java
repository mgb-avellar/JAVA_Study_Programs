import services.BrazilInterestService;
import services.USAInterestService;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
        Fazer um programa para ler uma quantia e a duração em meses de um
empréstimo. Informar o valor a ser pago depois de decorrido o prazo do
empréstimo, conforme regras de juros do Brasil. A regra de cálculo de
juros do Brasil é juro composto padrão de 2% ao mês.

Exemplo:

Amount: 200.00
Months: 3
Payment after 3 months:
212.24
         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();

        System.out.println("BRA example:");

        System.out.print("Amount: ");
        double amount = sc.nextDouble();
        System.out.print("Months: ");
        int months = sc.nextInt();

        BrazilInterestService is = new BrazilInterestService(2.0);

        double payment = is.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        System.out.println();

        System.out.println("USA example:");

        System.out.print("Amount: ");
        amount = sc.nextDouble();
        System.out.print("Months: ");
        months = sc.nextInt();

        USAInterestService is2 = new USAInterestService(1.0);

        payment = is2.payment(amount, months);

        System.out.println("Payment after " + months + " months:");
        System.out.println(String.format("%.2f", payment));

        System.out.println();

        sc.close();

    }
}
