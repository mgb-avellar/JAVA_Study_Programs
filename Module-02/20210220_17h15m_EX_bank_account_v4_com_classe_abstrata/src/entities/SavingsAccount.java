package entities;

public final class SavingsAccount extends BankAccount {

    /*
    A inserção de final impede que a classe SavingsAccount seja extendida.

     */

    private Double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance() {

        this.balance += this.balance * this.interestRate;
    }

    @Override
    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    /*
    A inserção de final impede que o método withdraw seja sobrescrito novamente

     */
}
