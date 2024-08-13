package JAVA8_Homestasks.InterfaceAndStreams;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;

public class HomeTaskFour_Consumer
{
    public static void main(String[] args) {
        // Sample product list
        List<Product> products = List.of(
                new Product("Laptop", 1500.0, "Electronics", "Standard"),
                new Product("Book", 15.0, "Books", "Standard"),
                new Product("Headphones", 120.0, "Electronics", "Standard"),
                new Product("Smartphone", 2000.0, "Electronics", "Standard"),
                new Product("Luxury Watch", 3500.0, "Accessories", "Standard")
        );

        // 1. Consumer to print product to console or file

        System.out.println("1 : Consumer to print product to console or file");
        Consumer<Product> printProductConsumer =  p -> {
            String printMedium = "file";
            if (printMedium.equalsIgnoreCase("file")) {
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("src/main/resources/products.txt", true))) {
                    writer.write(p.toString());
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(p);
            }
        };

        products.forEach(printProductConsumer);
        System.out.println();

        // 2. Consumer to update the grade of products with price > 1000
        System.out.println("2 : Consumer to update the grade of products with price > 1000");
        Consumer<Product> updateGradeConsumer =  p-> {
            if (p.getPrice() > 1000) {
                p.setGrade("Premium");
            }
            System.out.println(p);
        };

        products.forEach(updateGradeConsumer);
        System.out.println();

        // 3. Consumer to update the name of products with price > 3000
        System.out.println("3 : Consumer to update the name of products with price > 3000");
        Consumer<Product> updateNameConsumer =  p-> {
            if (p.getPrice() > 3000) {
                p.setName(p.getName() + "*");
            }
            System.out.println(p);
        };

        products.forEach(updateNameConsumer);
        System.out.println();

        // 4. Print all Premium grade products with name suffixed with '*'
        System.out.println("4 : Print all Premium grade products with name suffixed with '*'");
        Consumer<List<Product>> printPremiumProductsConsumer =  productList -> {
            productList.stream()
                    .filter(p -> p.getGrade().equalsIgnoreCase("Premium"))
                    .filter(p -> p.getName().endsWith("*"))
                    .forEach(System.out::println);
        };

        printPremiumProductsConsumer.accept(products);
        System.out.println();
    }
}
