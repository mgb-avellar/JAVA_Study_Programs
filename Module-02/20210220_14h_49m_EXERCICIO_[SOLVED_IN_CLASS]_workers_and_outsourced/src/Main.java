import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Uma empresa possui funcionários próprios e terceirizados.
            Para cada funcionário, deseja-se registrar nome, horas
            trabalhadas e valor por hora. Funcionários terceirizados
            possuem ainda uma despesa adicional.
            O pagamento dos funcionários corresponde ao valor da hora
            multiplicado pelas horas trabalhadas, sendo que os
            funcionários terceirizados ainda recebem um bônus
            correspondente a 110% de sua despesa adicional.
            Fazer um programa para ler os dados de N funcionários (N
            fornecido pelo usuário) e armazená-los em uma lista. Depois
            de ler todos os dados, mostrar nome e pagamento de cada
            funcionário na mesma ordem em que foram digitados.
            Construa o programa conforme projeto ao lado. Veja
            exemplo na próxima página.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.println();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {

            System.out.println("Employee #" + (i + 1) + " data:");
            System.out.print("Outsourced (y/n) ? " );
            char ans = sc.next().charAt(0);
            sc.nextLine();

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value por hour: ");
            double valuePerHour = sc.nextDouble();

            if ( ans == 'y') {

                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();

                // OutsourcedEmployee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                // Alternativamente ao comando acima, posso fazer:

                Employee employee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employeeList.add(employee);
            }
            else {

                Employee employee = new Employee(name, hours, valuePerHour);
                employeeList.add(employee);
            }

        }

        System.out.println();
        System.out.println("PAYMENTS:");

        for (Employee employee : employeeList) {

            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));

        }

        sc.close();
    }
}
