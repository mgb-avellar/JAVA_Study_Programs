import entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*
        Um site de internet registra um log de acessos dos usuários. Um
        registro de log consiste no nome de usuário (apenas uma palavra) e o
        instante em que o usuário acessou o site no padrão ISO 8601,
        separados por espaço, conforme exemplo. Fazer um programa que leia
        o log de acessos a partir de um arquivo, e daí informe quantos usuários
        distintos acessaram o site.

        "/home/marcio/IdeaProjects/00-JAVA-NELIO-ALVES-JORNADA-BBCHAIN-PITANG/Module-03/logList.txt";

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String path = sc.nextLine();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            /*
            A ideia de usar a estrutura Set aqui é bastante interessante. Poderíamos ter
            usado List.
            Acontece que podemos nos apoiar nas operações de Set para nosso propósito.
            O conceito de conjuntos é interessante por não permitir duplicatas, ou seja,
            a mesma entrada mais de uma vez.
            Quando adicionamos elementos ao conjunto, a operação add não deixa inserir o
            mesmo dado mais de uma vez, de modo que cada entrada é única no conjunto.
             */

            Set<LogEntry> set = new HashSet<>(); // crio o conjunto que receberá os dados do arquivo

            // estrutura de leitura de arquivo
            String line = br.readLine();
            while (line != null) {

                String[] fields = line.split(" ");
                String username = fields[0];
                Date moment = Date.from(Instant.parse(fields[1]));

                set.add(new LogEntry(username, moment)); // O set não deixa adicionar entradas repetidas

                line = br.readLine();
            }
            System.out.println("Total users: " + set.size());

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();


    }
}
