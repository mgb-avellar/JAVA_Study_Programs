package util;

public class CurrencyConverter {

    public static final double iof = 0.06;

    public static double amountInReais (double dollarPrice, double dollarAmount) {

        double total = (dollarPrice * dollarAmount);
        total += total * iof;
        return ( total );
    }


}
