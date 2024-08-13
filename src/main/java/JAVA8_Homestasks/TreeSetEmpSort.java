package JAVA8_Homestasks;

import java.util.TreeSet;

public class TreeSetEmpSort
{
    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator for sorting by name
        TreeSet<Employee> employees = new TreeSet<>(new NameComparator());

        // Add some Employee objects to the TreeSet
        employees.add(new Employee("John", 50000, 101));
        employees.add(new Employee("Alice", 75000, 102));
        employees.add(new Employee("Bob", 62000, 103));
        employees.add(new Employee("Charlie", 55000, 104));

        System.out.println("Employees sorted by name without lambda :");
        for (Employee e : employees) {
            System.out.println(e);
        }

        TreeSet<Employee> employeesLambda = new TreeSet<>((emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

        employeesLambda.add(new Employee("Casey", 50000, 101));
        employeesLambda.add(new Employee("Allie", 75000, 102));
        employeesLambda.add(new Employee("Bobby", 62000, 103));
        employeesLambda.add(new Employee("Chuck", 55000, 104));

        // Print the elements of the TreeSet
        System.out.println("Employees sorted by name with lambda :");
        for (Employee e : employeesLambda) {
            System.out.println(e);
        }
    }
}
