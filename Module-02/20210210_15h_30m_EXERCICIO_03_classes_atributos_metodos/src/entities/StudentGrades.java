package entities;

public class StudentGrades {

    public String name;
    public double gradeA, gradeB, gradeC;

    public double finalGrade() {

        return (gradeA + gradeB + gradeC);
    }

    public double missingPoints () {

        if ( finalGrade() < 60.0 ) {

            return 60.0 - finalGrade();
        }
        else {

            return 0.0;
        }
    }


}
