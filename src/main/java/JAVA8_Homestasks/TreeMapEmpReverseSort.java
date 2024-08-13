package JAVA8_Homestasks;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import JAVA8_Homestasks.Employee;

class ReverseNameComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e2.getName().compareTo(e1.getName()); // Reversed order
    }
}
public class TreeMapEmpReverseSort
{
    public static void main(String[] args) {
        // Create a TreeMap with a custom comparator for descending order by name
        TreeMap<Employee, Integer> map = new TreeMap<>(new ReverseNameComparator());

        // Add some Employee objects to the TreeMap
        map.put(new Employee("John", 50000, 101), 101);
        map.put(new Employee("Alice", 75000, 102), 102);
        map.put(new Employee("Bob", 62000, 103), 103);
        map.put(new Employee("Charlie", 55000, 104), 104);

        System.out.println("TreeMap sorted by employee name in descending order without lambda :");
        for (Map.Entry<Employee, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        TreeMap<Employee, Integer> mapLambda = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

        // Add some Employee objects to the TreeMap
        mapLambda.put(new Employee("Casey", 50000, 101), 1);
        mapLambda.put(new Employee("Allie", 75000, 102), 2);
        mapLambda.put(new Employee("Bobby", 62000, 103), 3);
        mapLambda.put(new Employee("Chuck", 55000, 104), 4);

        // Print the entries of the TreeMap
        System.out.println("TreeMap sorted by employee name in descending order (with lambda):");
        for (Map.Entry<Employee, Integer> entry : mapLambda.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}
