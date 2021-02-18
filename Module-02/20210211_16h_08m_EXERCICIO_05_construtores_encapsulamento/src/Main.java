import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount = new BankAccount();

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String accountHolder = sc.nextLine();

        System.out.print("Is there an initial deposit value (y/n)? ");
        char answer = sc.next().charAt(0);

        if ( answer == 'y') {

            double initialDepositValue;
            System.out.print("Enter the initial deposit value: ");
            initialDepositValue = sc.nextDouble();
            bankAccount = new BankAccount(accountNumber, accountHolder, initialDepositValue);
        }
        else {

            bankAccount = new BankAccount(accountNumber, accountHolder);
        }

        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.println();

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        bankAccount.depositMoney(depositValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withDrawMoney(withdrawValue);

        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();

        System.out.print("Do you want to change the holder name? (y/n) ");
        answer = sc.next().charAt(0);
        sc.nextLine();

        if ( answer == 'y' ) {

            System.out.print("Enter the name again: ");
            String name = sc.nextLine();
            bankAccount.setAccountHolder(name);
            System.out.println("Updated account data: ");
            System.out.println(bankAccount);
        }
        else {
            System.out.println("Summary:");
            System.out.println(bankAccount);
        }



        sc.close();
    }




}
