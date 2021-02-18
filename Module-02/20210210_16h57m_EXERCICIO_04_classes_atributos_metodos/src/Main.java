import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        double dollarPrice, dollarAmount;


        System.out.println();

        System.out.print("What is the dollar price? ");
        dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        dollarAmount = sc.nextDouble();

        System.out.printf("Amount to be paid in Reais = %.2f", CurrencyConverter.amountInReais(dollarPrice, dollarAmount));

        System.out.println();

        sc.close();
    }
}
