package entities;

public class BankAccount {

    private int accountNumber;
    private String accountHolder;
    private double accountBalance;

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        // this.accountBalance = initialDeposit; // Eu poderia fazer isso, porém, para proteger
                                                 //   o construtor de mudanças na regra de deposito,
                                                 //   chamamos aqui o método de depósito.
        depositMoney(initialDeposit);
    }

    public BankAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }

    public BankAccount() {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void depositMoney (double accountBalance) {

        this.accountBalance += accountBalance;

    }

    public void withDrawMoney (double accountBalance) {

        this.accountBalance -= (accountBalance + 5.00);

    }

    public String toString() {

        return "Account "
                + this.accountNumber
                + ", Holder: "
                + this.accountHolder
                + ", Balance $ "
                + String.format("%.2f", this.accountBalance);

    }


}
