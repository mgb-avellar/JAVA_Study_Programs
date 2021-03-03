import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /*
        Em um portal de cursos online, cada usuário possui um código único, representado por
        um número inteiro.
        Cada instrutor do portal pode ter vários cursos, sendo que um mesmo aluno pode se
        matricular em quantos cursos quiser. Assim, o número total de alunos de um instrutor não
        é simplesmente a soma dos alunos de todos os cursos que ele possui, pois pode haver
        alunos repetidos em mais de um curso.
        O instrutor Alex possui três cursos A, B e C, e deseja saber seu número total de alunos.
        Seu programa deve ler os alunos dos cursos A, B e C do instrutor Alex, depois mostrar a
        quantidade total e alunos dele, conforme exemplo.
         */

        Scanner sc = new Scanner(System.in);

        // Criando os conjuntos para os três cursos de Alex (conjunto de inteiros):

        Set<Integer> curso_A = new HashSet<>();
        Set<Integer> curso_B = new HashSet<>();
        Set<Integer> curso_C = new HashSet<>();

        System.out.println();
        System.out.print("How many students in course A? ");
        int n = sc.nextInt();
        System.out.println("Enter their identification:");

        for (int i = 0; i < n; i++) {

            curso_A.add(sc.nextInt());
        }

        System.out.println();
        System.out.print("How many students in course B? ");
        n = sc.nextInt();
        System.out.println("Enter their identification:");

        for (int i = 0; i < n; i++) {

            curso_B.add(sc.nextInt());
        }

        System.out.println();
        System.out.print("How many students in course C? ");
        n = sc.nextInt();
        System.out.println("Enter their identification:");

        for (int i = 0; i < n; i++) {

            curso_C.add(sc.nextInt());
        }

        Set<Integer> unique = new HashSet<>();

        unique.addAll(curso_A);
        unique.addAll(curso_B);
        unique.addAll(curso_C);

        System.out.print("Total students: " + unique.size());

    }
}
