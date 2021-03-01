package services;

import java.security.InvalidParameterException;

public interface InterestService {

    double getInterestRate();
    default double payment(Double amount, Integer months) {

        // Programação defensiva:
        if (months < 1) {
            throw new InvalidParameterException("Months must be greater than zero.");
        }

        return ( amount * Math.pow((1 + getInterestRate() / 100.0), months));
    }
}
