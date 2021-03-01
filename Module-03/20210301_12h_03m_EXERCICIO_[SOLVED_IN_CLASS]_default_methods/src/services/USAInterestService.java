package services;

import java.security.InvalidParameterException;

public class USAInterestService {

    private double interestRate;

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double payment(Double amount, Integer months) {

        // Programação defensiva:
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero.");
        }

        return ( amount * Math.pow((1 + this.interestRate / 100.0), months));
    }
}
