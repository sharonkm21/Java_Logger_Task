package CollectionsHomeTasks.CollectionsDemo;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

class Student {
    private int id;
    private String name;
    private double grade;

    public Student(int id, String name, double grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getGrade() {
        return grade;
    }
    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade=" + grade + "}";
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class StudentCollectionTask
{
    public static void main(String[] args) {
        // Create a HashMap to store Student objects with id as key
        Map<Integer, Student> studentMap = new HashMap<>();

        // Adding Students to the HashMap
        studentMap.put(1, new Student(1, "Alice", 85.5));
        studentMap.put(2, new Student(2, "Bob", 91.0));
        studentMap.put(3, new Student(3, "Charlie", 78.3));

        // Retrieve a Student by ID
        Student student = studentMap.get(2);
        System.out.println("Retrieved Student: " + student);

        // Iterate through the HashMap
        System.out.println("\nIterating through the Student HashMap:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }

        // Remove a Student by ID
        studentMap.remove(1);
        System.out.println("\nHashMap after removing the student with ID 1:");
        for (Map.Entry<Integer, Student> entry : studentMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", " + entry.getValue());
        }
    }
}
