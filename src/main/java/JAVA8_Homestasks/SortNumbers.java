package JAVA8_Homestasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class ReverseOrderComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer a, Integer b) {
        return b.compareTo(a);  // Reverse order comparison
    }
}

public class SortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(5, 1, 4, 2, 3);

        Collections.sort(numbers, new ReverseOrderComparator());

        System.out.println("Sorted list in reverse order without lambda : " + numbers);
        Collections.sort(numbers, (a, b) -> b.compareTo(a));
        System.out.println("Sorted list in reverse order with lambda : " + numbers);
    }
}
