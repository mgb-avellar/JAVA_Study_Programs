import entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        /*
        Faça um programa para ler um arquivo contendo nomes de pessoas (um nome por
linha), armazenando-os em uma lista. Depois, ordenar os dados dessa lista e mostra-los
ordenadamente na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Depois, faça um programa para ler um arquivo contendo funcionários (nome e salário) no
formato .csv, armazenando-os em uma lista. Depois, ordenar a lista por nome e mostrar
o resultado na tela. Nota: o caminho do arquivo pode ser informado "hardcode".

Vou usar o versionamento do github.


         */

        // List<String> list = new ArrayList<>();

        List<Employee> list = new ArrayList<>();

        String path = "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/nameList_v2.csv";

        System.out.println();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            //String name = br.readLine();
            String employeeData = br.readLine();

            while (employeeData != null) {
                //list.add(name);

                String[] fields = employeeData.split(",");

                list.add(new Employee(fields[0], Double.parseDouble((fields[1]))));

                employeeData = br.readLine();
            }

            /*
            O maior problema é que do jeito que estava, o Collections não estava aceitando
            ordenar a lista de Employees, pois o método 'sort' não é aplicável para argumentos
            do tipo Employee. Por isso tivemos que implementar a classe genérica Comparable na
            classe Employee com o cabeçalho

            public class Employee implements Comparable<Employee>

            Esse comando diz que Employee é do tipo Comparable. Aí podemos usar os recursos
            de Comparable.
             */

            Collections.sort(list); // Isso ordena a lista. Veja na classe Employee como
                                    //    ordenar por nome ou por salário.


            //for (String s : list) {
            for (Employee emp : list) {
                System.out.println(emp.getName() + ", " + emp.getSalary());
            }
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
