package JAVA8_Homestasks;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsReverseSortEmp
{
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 50000, 101));
        employees.add(new Employee("Alice", 75000, 102));
        employees.add(new Employee("Bob", 62000, 103));
        employees.add(new Employee("Charlie", 55000, 104));

        // Sort the list using Collections.sort with a custom comparator
        Collections.sort(employees, new ReverseNameComparator());

        // Print the sorted list
        System.out.println("Employees sorted by name in descending order without lambda:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

        System.out.println("Employees sorted by name in descending order with lambda:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
