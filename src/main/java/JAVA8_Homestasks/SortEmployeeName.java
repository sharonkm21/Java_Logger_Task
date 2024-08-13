package JAVA8_Homestasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class NameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee a, Employee b) {
        return a.getName().compareTo(b.getName());
    }
}
public class SortEmployeeName {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000, 101),
                new Employee("Alice", 75000, 102),
                new Employee("Bob", 62000, 103),
                new Employee("Charlie", 55000, 104)
        );

        Collections.sort(employees, new NameComparator());

        System.out.println("Sorted list of employees by name without lambda :");
        for (Employee e : employees) {
            System.out.println(e);
        }

        Collections.sort(employees, (emp1, emp2) -> emp1.getName().compareTo(emp2.getName()));

        System.out.println("Sorted list of employees by name (with lambda):");
        for (Employee e : employees) {
            System.out.println(e);
        }

    }
}

