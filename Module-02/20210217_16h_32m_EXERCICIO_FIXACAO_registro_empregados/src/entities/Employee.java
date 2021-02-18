package entities;

public class Employee {

    //private Integer id;
    //private String name;
    //private Double salary;

    public Integer id;
    public String name;
    public Double salary;

    public Employee(Integer id, String name, Double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public Employee() {

    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void increaseSalary (double x) {

        this.salary += this.salary * x / 100.00;
    }

    public String toString() {

        return "Employee "
                + this.name
                + ", ID: "
                + this.id
                + ", salary $ "
                + String.format("%.2f", this.salary);

    }


}
