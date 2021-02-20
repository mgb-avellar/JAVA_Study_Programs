package entities;

public class Department {

    /*
        Esta classe possui apenas a variável para o nome do departamento em questão.
        Precisamos apenas de um constructo básico, um constructo com parâmetros e de getters and setters.

     */

    private String departmentName;

    public Department() {

    }

    public Department(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
