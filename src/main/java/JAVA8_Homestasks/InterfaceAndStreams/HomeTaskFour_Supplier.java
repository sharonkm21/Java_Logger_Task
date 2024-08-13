package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class HomeTaskFour_Supplier
{
    public static void main(String[] args) {

        // 1. Supplier to produce a random product

        System.out.println("1 : Supplier to produce a random product");
        List<Product> products = List.of(
                new Product("Laptop", 1500.0, "Electronics", "Standard"),
                new Product("Book", 15.0, "Books", "Standard"),
                new Product("Headphones", 120.0, "Electronics", "Standard"),
                new Product("Smartphone", 2000.0, "Electronics", "Standard"),
                new Product("Luxury Watch", 3500.0, "Accessories", "Standard")
        );

        Supplier<Product> randomProductSupplier = () -> {
            Random random = new Random();
            return products.get(random.nextInt(products.size()));
        };

        // Generate and print a random product from the predefined list
        Product randomProduct = randomProductSupplier.get();
        System.out.println("Random Product: " + randomProduct);

        System.out.println();

        // 2. Supplier to produce a random OTP
        System.out.println("2. Supplier to produce a random OTP");
        Supplier<String> randomOTPSupplier = () -> {
            Random random = new Random();
            int otp = 100000 + random.nextInt(900000); // Generate a 6-digit OTP
            return String.valueOf(otp);
        };

        String randomOTP = randomOTPSupplier.get();
        System.out.println("Random OTP: " + randomOTP);
        System.out.println();

    }
}
