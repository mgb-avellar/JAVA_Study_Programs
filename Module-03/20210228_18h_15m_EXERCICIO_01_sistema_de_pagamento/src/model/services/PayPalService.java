package model.services;

public class PayPalService implements OnlinePaymentService {

    private static final double FEE = 0.02;
    private static final double MONTHLY_INTEREST = 0.01;

    public double interest(Double amount, Integer months) {

        return ( amount * MONTHLY_INTEREST * months );
    }

    public double paymentFee(Double amount) {

        return ( amount * FEE );
    }






}
