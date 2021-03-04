import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    /*
    Fazer um programa para ler os dados (nome, email e salário)
    de funcionários a partir de um arquivo em formato .csv.
    Em seguida mostrar, em ordem alfabética, o email dos
    funcionários cujo salário seja superior a um dado valor
    fornecido pelo usuário.
    Mostrar também a soma dos salários dos funcionários cujo
    nome começa com a letra 'M'.
    Veja exemplo na próxima página.

    ENTRADA:
    Maria,maria@gmail.com,3200.00
    Alex,alex@gmail.com,1900.00
    Marco,marco@gmail.com,1700.00
    Bob,bob@gmail.com,3500.00
    Anna,anna@gmail.com,2800.00

    SAÍDA:
    Enter full file path: xxxxxxx
    Enter salary: 2000.00
    Email of people whose salary is more than 2000.00:
    anna@gmail.com
    bob@gmail.com
    maria@gmail.com
    Sum of salary of people whose name starts with 'M': 4900.00

     */

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println();

        // Preciso ler o arquivo de dados dos funcionários, fornecendo o caminho:
        /*
 /home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/employeeList.csv
         */

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();

        // Para ler o arquivo, um bloco try-catch cwith resources

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            // Preciso de uma lista contendo os dados dos funcionários

            List<Employee> employeeList = new ArrayList<>();

            // A leitura do arquivo e o armazenamento na lista que accabei de criar vem a seguir

            String line = br.readLine();

            while (line != null) {

                // crio um vetor de strinds contendo os campos do arquivo que são
                //   separados pelo regex vírgula

                String[] fields = line.split(",");

                // Adiciono os campos na lista: cada "linha" da lista terá três campos
                //   conforme as informações no arquivo.
                // No entanto, cada linha da lista é um objeto Employee.

                employeeList.add( new Employee( fields[0], fields[1], Double.parseDouble(fields[2]) ) );

                // Leio a próxima linha do arquivo

                line = br.readLine();
            }


            // Agora entra a lógica do meu programa

            System.out.print("Enter with the salary cut: ");
            double salaryCut = sc.nextDouble();

            System.out.println();
            System.out.println("Email of employees whose salary is higher than: " + salaryCut);

            List<String> emailList = employeeList.stream()
                    .filter(employee -> employee.getEmployeeSalary() >= salaryCut)
                    .map(employee -> employee.getEmployeeEmail())
                    .collect(Collectors.toList());

            emailList.forEach(System.out::println);


            // A seguir, a soma dos salários dos funcionários cujo nome começa com a letra 'M'

            double salarySum = employeeList.stream()
                    .filter(employee -> employee.getEmployeeName().charAt(0) == 'M')
                    .map(employee -> employee.getEmployeeSalary())
                    .reduce(0.0, (x, y) -> x + y);

            System.out.println();
            System.out.println("Sum of the salaries of employees whose names begin with 'M': " + salarySum);

        }
        catch (IOException e) {
            // solta exceção em caso de erro de leitura de arquivo
            System.out.println("Error: " + e.getMessage());
        }






        sc.close();
    }
}
