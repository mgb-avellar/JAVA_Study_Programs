import entities.BankAccount;
import entities.BusinessBankAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args){

        /*
        Suponha que a operação de
        saque possui uma taxa no valor
        de 5.0. Entretanto, se a conta
        for do tipo poupança, esta taxa
        não deve ser cobrada.
        Como resolver isso?
        Resposta: sobrescrevendo o
        método withdraw na subclasse
        SavingsAccount

        Suponha também que, na classe BusinessAccount, a regra para saque seja realizar o
        saque normalmente da superclasse, e descontar mais 2.0. Para resolver isso uso
        os comandos
        super.withdraw(amount)
        this.balance -= 2.0

         */

        BankAccount acc1 =  new BankAccount(1001, "Alex", 1000.0);

        acc1.withdraw(200.0);

        System.out.println("Saldo: " + acc1.getBalance());

        BankAccount acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);

        acc2.withdraw(200.0);

        System.out.println("Saldo: " + acc2.getBalance());

        BankAccount acc3 = new BusinessBankAccount(1003, "Bob", 1000.0, 500.0);

        acc3.withdraw(200.0);

        System.out.println("Saldo: " + acc3.getBalance());

    }
}
