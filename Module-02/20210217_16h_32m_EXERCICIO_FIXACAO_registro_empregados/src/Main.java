import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*
            Fazer um programa para ler um número inteiro N e depois os dados (id, nome e salario) de
                N funcionários. Não deve haver repetição de id.
            Em seguida, efetuar o aumento de X por cento no salário de um determinado funcionário.
            Para isso, o programa deve ler um id e o valor X. Se o id informado não existir, mostrar uma
                mensagem e abortar a operação. Ao final, mostrar a listagem atualizada dos funcionários,
                conforme exemplos.
            Lembre-se de aplicar a técnica de encapsulamento para não permitir que o salário possa
                ser mudado livremente. Um salário só pode ser aumentado com base em uma operação de
                aumento por porcentagem dada.

         */

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> employeeList = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int N = sc.nextInt();
        sc.nextLine();

        System.out.println();

        for (int i = 0; i < N; i++) {

            System.out.printf("Employee # %d: \n", i + 1);
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            while (employeeListHasID(employeeList, id)) {

                System.out.print("ID already taken. Try again: ");
                id = sc.nextInt();
                sc.nextLine();

                /*
                employeeListHasID: Método criado em Main para verificar a existência
                do ID (ver ao final)
                 */
            }

            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();
            sc.nextLine();

            Employee employee = new Employee(id, name, salary);

            employeeList.add(employee);
        }

        System.out.println();
        System.out.println("Updated employee list: ");

        for (Employee x : employeeList) {
            System.out.println(x.toString());
        }

        System.out.println();
        System.out.print("Enter the employee ID that will have salary increased: ");
        int id = sc.nextInt();

        Employee searchID = employeeList.stream().filter(x -> x.id == id).findFirst().orElse(null);

        if ( searchID == null ) {

            System.out.println("This ID does not exist.");
            System.out.println();
        }
        else {

            System.out.print("Enter the percentage: ");
            double percentage = sc.nextDouble();
            searchID.increaseSalary(percentage);

        }

        for (Employee x : employeeList) {
            System.out.println(x.toString());
        }

        sc.close();

    }

    public static boolean employeeListHasID(List<Employee> list, int id) {
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return emp != null; // Linha necessária para o while, pois é "enquanto for diferente de null
    }
}
