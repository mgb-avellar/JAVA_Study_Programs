package entities;

public class Employee {

    private String employeeName;
    private String employeeEmail;
    private Double employeeSalary;

    public Employee(String employeeName, String employeeEmail, Double employeeSalary) {
        this.employeeName = employeeName;
        this.employeeEmail = employeeEmail;
        this.employeeSalary = employeeSalary;
    }

    public Employee() {

    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getEmployeeEmail() {
        return employeeEmail;
    }

    public void setEmployeeEmail(String employeeEmail) {
        this.employeeEmail = employeeEmail;
    }

    public double getEmployeeSalary() {
        return employeeSalary;
    }

    public void setEmployeeSalary(double employeeSalary) {
        this.employeeSalary = employeeSalary;
    }

    @Override
    public String toString() {
        return "Employee [" +
                "employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", employeeSalary=" + employeeSalary +
                ']';
    }
}
