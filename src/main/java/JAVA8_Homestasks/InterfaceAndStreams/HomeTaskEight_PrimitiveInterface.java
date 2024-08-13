package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.Random;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.IntSupplier;

public class HomeTaskEight_PrimitiveInterface
{
    public static void main(String[] args) {

        System.out.println("1 : Write an IntPredicate to verify if the given number is a prime number");
        IntPredicate isPrime = num -> {
            if (num <= 1) return false;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) return false;
            }
            return true;
        };

        System.out.println(isPrime.test(5)); // true
        System.out.println(isPrime.test(10)); // false

        System.out.println("2 : Write an IntConsumer to print square of the given number");

        IntConsumer printSquare = num -> System.out.println("Square of " + num + " is: " + (num * num));
        printSquare.accept(5); // Square of 5 is: 25
        printSquare.accept(10); // Square of 10 is: 100

        System.out.println("3 : Write a IntSupplier to give random int below 5000. ");

        Random random = new Random();
        IntSupplier randomIntBelow5000 = () -> random.nextInt(5000);
        System.out.println("Random number below 5000: " + randomIntBelow5000.getAsInt());
    }
}
