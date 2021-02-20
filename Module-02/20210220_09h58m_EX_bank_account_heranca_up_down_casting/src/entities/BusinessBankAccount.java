package entities;

public class BusinessBankAccount extends BankAccount {

    private Double loanLimit;

    public BusinessBankAccount() {
        super(); // Não é obrigatório, mas é bom para resguardarmos de alguma lógica no contrutor padrão
    }

    public BusinessBankAccount(Integer number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount) {

        if (amount <= loanLimit) {

            this.balance += amount - 10.0;
            /*
                this.balance só é visível porque usei protected em vez de private
                lá na BankAccount para a variável balance
             */
        }

    }
}
