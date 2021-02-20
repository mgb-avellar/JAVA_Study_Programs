import entities.BankAccount;
import entities.BusinessBankAccount;
import entities.SavingsAccount;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        /*
            Suponha que em um negócio relacionado a banco, apenas
            contas poupança e contas para empresas são permitidas.
            Não existe conta comum.
            Para garantir que contas comuns não possam ser
            instanciadas, basta acrescentarmos a palavra "abstract" na
            declaração da classe.
            public abstract class Account {
            (...)
            Notação UML: itálico

         */

        Locale.setDefault(Locale.US);

        BankAccount acc1 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        BankAccount acc2 = new BusinessBankAccount(1003, "Bob", 1000.0, 500.0);

        // Não consigo instanciar BankAccount acc3 = new BankAccount(1001, "Alex", 1000.0);
        //   porque a classe BankAccount agora é abstrata.

        /*
            • Se a classe Account não pode ser instanciada, por
            que simplesmente não criar somente SavingsAccount
            e BusinessAccount?
            • Resposta:
                • Reuso
                • Polimorfismo: a superclasse classe genérica nos permite tratar
            de forma fácil e uniforme todos os tipos de conta, inclusive
            com polimorfismo se for o caso (como fizemos nos últimos
            exercícios). Por exemplo, você pode colocar todos tipos de
            contas em uma mesma coleção.
            • Demo: suponha que você queira:
                • Totalizar o saldo de todas as contas.
                • Depositar 10.00 em todas as contas.

         */

        List<BankAccount> accountsList = new ArrayList<>();

        accountsList.add(new SavingsAccount(1002, "Maria", 1000.0, 0.01));
        accountsList.add(new BusinessBankAccount(1003, "Bob", 1000.0, 500.0));
        accountsList.add(new SavingsAccount(1004, "Marcio", 69845.0, 0.01));
        accountsList.add(new BusinessBankAccount(1005, "Rosi", 774541.0, 500.0));
        accountsList.add(new SavingsAccount(1006, "Bombs", 1000000.0, 0.01));
        accountsList.add(new BusinessBankAccount(1007, "Connor", 563.0, 500.0));

        double sum = 0.0;

        for (BankAccount acc : accountsList) {

            sum += acc.getBalance();
        }

        System.out.printf("Total balance: %.2f \n", sum);

        System.out.println();

        for (BankAccount acc : accountsList) {

            acc.deposit(0.02);
        }

        for (BankAccount acc : accountsList) {

            System.out.printf("Updated balance for account %d: %.2f \n", acc.getNumber(), acc.getBalance());
        }





    }
}
