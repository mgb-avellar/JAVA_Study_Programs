package model.entities;

import model.exceptions.DomainException;

public class Account {

    private Integer accountNumber;
    private String accountHolder;
    private Double accountBalance;
    private Double accountWithdrawLimit;

    public Account() {

    }

    public Account(Integer accountNumber, String accountHolder, Double accountBalance, Double accountWithdrawLimit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountWithdrawLimit = accountWithdrawLimit;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public Double getAccountBalance() {
        return accountBalance;
    }

    public Double getAccountWithdrawLimit() {
        return accountWithdrawLimit;
    }

    public void deposit(Double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(Double amount) throws DomainException {

        // Tratando exceção de saque maior que limite de saque

        if (amount > this.accountWithdrawLimit) {

            throw new DomainException("The amount exceeds withdraw limit");
        }
        if (amount >  this.accountBalance) {

            throw new DomainException("Not enough balance.");
        }




        this.accountBalance -= amount;
    }

}
