package JAVA8_Homestasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargestNumber
{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(15);
        numbers.add(30);
        numbers.add(25);
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Second Largest Number: " + numbers.get(1));

        numbers.add(5);
        numbers.add(1);
        numbers.add(0);
        numbers.add(50);
        numbers.add(45);

        numbers.sort((a, b) -> b.compareTo(a));
        System.out.println("Second Largest Number: " + numbers.get(1));
    }
}
