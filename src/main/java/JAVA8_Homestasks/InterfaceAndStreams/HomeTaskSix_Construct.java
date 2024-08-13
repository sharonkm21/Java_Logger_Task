package JAVA8_Homestasks.InterfaceAndStreams;
import JAVA8_Homestasks.Employee;

@FunctionalInterface
interface CreateFunction<T, U, V, R> {
    R apply(T t, U u, V v);
}

public class HomeTaskSix_Construct
{
    public static void main(String[] args) {
        CreateFunction<String, Long, Integer, Employee> employeeCreator = Employee::new;

        Employee emp = employeeCreator.apply("Ricky Martin", (long) 775000.0, 105);
        System.out.println(emp);
    }
}
