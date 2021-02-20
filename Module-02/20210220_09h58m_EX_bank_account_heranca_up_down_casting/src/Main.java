import entities.BankAccount;
import entities.BusinessBankAccount;
import entities.SavingsAccount;

public class Main {

    public static void main(String[] args){

        BankAccount acc =  new BankAccount(1001, "Alex", 0.0);

        BusinessBankAccount bAcc=  new BusinessBankAccount(1002, "Maria", 0.0, 500.0);

        // Upcasting : subclasse -> superclasse

        BankAccount acc1 = bAcc;  // é possível porque bAcc é uma Account, pois Account é superclasse.
        BankAccount acc2 = new BusinessBankAccount(1003, "Bob", 0.0, 200.0);
        BankAccount acc3 = new SavingsAccount(1004,"Anna", 0.0, 0.01);

        // Downcasting : superclasse -> subclasse

        // BusinessBankAccount acc4 = acc2; // esse comando não funciona, pois subclasse não recebe superclasse

        BusinessBankAccount acc4 = (BusinessBankAccount) acc2; // casting manual
        acc4.loan(100.0);

       // BusinessBankAccount acc5 = (BusinessBankAccount) acc3; // essa operação não dá problema
                                                               //   aqui, mas na execução dará
                                                               //   pois BusinessAccount não
                                                               //   pode ser convertifdo em
                                                               //   Savings Account

        // Na hora do downcasting, nem sempre dá certo e o compilador não saberá disso.
        // É preciso sempre ter cuidado no downcasting, por exemplo, usando instanceOf

        if (acc3 instanceof BusinessBankAccount) {
            BusinessBankAccount acc5 = (BusinessBankAccount) acc3;
            acc5.loan(200.0);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount) {
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update!");
        }

        /*
          O primeiro if falhará por que acc3 não é instanceOf de Business,
          mas o segundo if funciona porque acc3 é instance of the Savings
         */







    }
}
