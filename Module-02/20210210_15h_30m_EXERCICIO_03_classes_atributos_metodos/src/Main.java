import entities.StudentGrades;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        StudentGrades student = new StudentGrades();

        System.out.print("Enter the student name: ");
        student.name = sc.nextLine();

        System.out.println("Enter the three grades:");
        student.gradeA = sc.nextDouble();
        student.gradeB = sc.nextDouble();
        student.gradeC = sc.nextDouble();

        System.out.printf("FINAL GRADE: %.2f%n", student.finalGrade());
        if (student.finalGrade() < 60.0) {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS%n", student.missingPoints());
        }
        else {
            System.out.println("PASS");
        }
        sc.close();
    }
}
