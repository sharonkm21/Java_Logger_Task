package JAVA8_Homestasks;

public class Employee {
    private String name;
    private int id;
    private long salary;

    public Employee(String name,long salary, int id) {
        this.name = name;
        this.id=id;
        this.salary=salary;
    }

    public String getName() {
        return name;
    }

    public long getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    @Override
    public String toString() {
        return "Employee [ID = " + id + ", name = " + name + ", salary = " + salary + "]";
    }

}