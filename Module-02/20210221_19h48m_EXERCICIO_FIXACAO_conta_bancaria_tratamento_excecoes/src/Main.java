import model.entities.Account;
import model.exceptions.DomainException;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler os dados de uma conta bancária e depois realizar um
saque nesta conta bancária, mostrando o novo saldo. Um saque não pode ocorrer
ou se não houver saldo na conta, ou se o valor do saque for superior ao limite de
saque da conta. Implemente a conta bancária conforme projeto abaixo:

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println();
            System.out.println("Enter account data: ");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter account holder: ");
            String name = sc.nextLine();
            System.out.print("Initial balance: ");
            double deposit = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();

            Account account = new Account(number, name, deposit, limit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();

            account.withdraw(amount);

            System.out.println("New balance: " + account.getAccountBalance());
        }
        catch (DomainException e) {

            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error.");
        }

        sc.close();

    }
}
