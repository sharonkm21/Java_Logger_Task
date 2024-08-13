package JAVA8_Homestasks;

import java.util.TreeSet;

public class TreeSetSort
{
    public static void main(String[] args) {
        TreeSet<Integer> numbers = new TreeSet<>(new ReverseOrderComparator());

        numbers.add(10);
        numbers.add(5);
        numbers.add(20);
        numbers.add(15);

        System.out.println("Numbers in reverse order without lambda:");
        for (Integer number : numbers) {
            System.out.println(number);
        }

        TreeSet<Integer> numbersLambda = new TreeSet<>((a, b) -> b.compareTo(a));

        numbersLambda.add(10);
        numbersLambda.add(5);
        numbersLambda.add(20);
        numbersLambda.add(15);

        System.out.println("Numbers in reverse order with lambda:");
        for (Integer number : numbersLambda) {
            System.out.println(number);
        }
    }
}
