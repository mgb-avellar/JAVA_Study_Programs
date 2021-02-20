import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        /*
            Ler os dados de um trabalhador com N contratos (N fornecido pelo usuário). Depois, solicitar
do usuário um mês e mostrar qual foi o salário do funcionário nesse mês, conforme exemplo.

Enter department's name: Design
Enter worker data:
Name: Alex
Level: MID_LEVEL
Base salary: 1200.00
How many contracts to this worker? 3
Enter contract #1 data:
Date (DD/MM/YYYY): 20/08/2018
Value per hour: 50.00
Duration (hours): 20
Enter contract #2 data:
Date (DD/MM/YYYY): 13/06/2018
Value per hour: 30.00
Duration (hours): 18
Enter contract #3 data:
Date (DD/MM/YYYY): 25/08/2018
Value per hour: 80.00
Duration (hours): 10
Enter month and year to calculate income (MM/YYYY): 08/2018
Name: Alex
Department: Design
Income for 08/2018: 3000.00

         */

        /*

            ESTRATÉGIA:

            1. Criar a classe para o departamento (Department);
            2. Criar a classe dos contratos por hora (HourContract);
            3. Criar a classe enumerada dos níveis dos contratos (WorkerLevel);
            4. Criar a classe Worker;
            5. Programar o Main.

         */

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy"); // Sempre que mexo com datas é bom instanciar
                                                                           //   um simple date format

        // Vou entrar com todos os dados do trabalhador para poder instanciá-lo:

        System.out.print("Enter department's name: ");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data: ");
        System.out.print("Enter worker name: ");
        String workerName = sc.nextLine();
        System.out.print("Enter worker level (JUNIOR, MID_LEVEL, SENIOR): ");
        String workerLevel = sc.nextLine();
        System.out.print("Enter worker base salary: ");
        double workerBaseSalary = sc.nextDouble();

        // Instanciando o trabalhador com os dados entrados

        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), workerBaseSalary, new Department(departmentName));

        /*
            Note as diferenças com o processo normal de instanciação:

            1. para entrar com o nível, eu não coloco diretamente o nível digitado: entro com o WorkerLevel,
               que é o tipo enumerado, usando o valueOF() que recebe como argumento o workerLevel, que está na
               forma de String digitado acime. Com isso eu crio uma instância do meu tipo enumerado WokerLevel
               no valor equivalente ao que foi digitado.
            2. o departamento é um outro objeto, do tipo Departament; o trabalhador tem um departamento, que é
               uma classe separada, mas associada à classe Worker. A operação é uma composição de objetos. O
               procedimento é uma instanciação normal (não como a do tipo enumerado), no qual eu instancio o objeto
               e forneço o campo desejado, nesse caso o nome do departamento, departmentName.

            Obs: poderia ter feito em partes:

               WorkerLevel x = WorkerLevel.valueOf(workerLevel);
               Department y = new Department(departmentName);
               Worker worker = new Worker(workerName, x, workerBaseSalary, y);

               O tipo enumerado é mais parecido com um atributo normal de worker, sendo armazenado junto com
               os outros atributos como workerName e workerBaseSalary. Já o departamento ao qual o worker
               pertence forma um objeto à parte na memória: é realmente um objeto dentro de outro, é uma
               composição de objetos. O departamento é um atributo do tipo Department.

         */

        System.out.print("How many contracts does this worker have? ");
        int n = sc.nextInt();
        sc.nextLine();

        // Entro com os dados de cada contrato

        for ( int i = 0; i < n; i++) {

            System.out.println("Enter contract #" + (i + 1) + " data: ");
            System.out.print("Data (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());    // Preciso criar um simple date format (Veja acima)
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hour = sc.nextInt();

            // Esses dados formam UM contrato. Assim, posso instanciar esse contrato em questão.
            // Lembremos que cada trabalhador pode ter mais de um contrato. Assim:

            HourContract contract = new HourContract(contractDate, valuePerHour, hour);

            // Isso ainda não é suficiente: preciso associar esse contrato ao meu trabalhador:

            worker.addContract(contract); // Esse método adiciona um contrato à lista de contratos do trabalhador;
                                          //   o contract instanciado aqui é passado ao método que adiciona esse
                                          //   contract à lista workerContracts do trabalhador.
                                          //   (Veja a classe Worker, linhas 42 e 102.)
        }

        System.out.println();
        System.out.print("Enter the month and year to calculate income (MM/YYYY): ");

        String monthAndYear = sc.next();

        // Vamos usar a técnic de recorte de strings

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));    // Não preciso do segundo argumento porque é
                                                                   //    do 3 em diante até o fim.

        System.out.println("Name: " + worker.getWorkerName());
        System.out.println("Department: " + worker.getWorkerDepartment().getDepartmentName()); // Veja a composição
                                                                                               //   em ação
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
