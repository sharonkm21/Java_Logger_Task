package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTaskSeven_Streams
{
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1500, "electronics", "A"),
                new Product("Phone", 800, "electronics", "B"),
                new Product("TV", 1200, "electronics", "A"),
                new Product("Book", 50, "education", "B"),
                new Product("Headphones", 150, "electronics", "C")
        );

        System.out.println("Total cost of all products : " + calculateTotalCost(products));
        System.out.println("Cost of products with price > 1000 : " + calculateCostOfExpensiveProducts(products));
        System.out.println("Cost of all electronic products : " + calculateCostOfElectronicProducts(products));
        System.out.println("Expensive electronic products : " + getExpensiveElectronics(products));
    }

    public static double calculateTotalCost(List<Product> products) {
        return products.stream()
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static double calculateCostOfExpensiveProducts(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() > 1000)
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static double calculateCostOfElectronicProducts(List<Product> products) {
        return products.stream()
                .filter(product -> "electronics".equalsIgnoreCase(product.getCategory()))
                .mapToDouble(Product::getPrice)
                .sum();
    }

    public static List<Product> getExpensiveElectronics(List<Product> products) {
        return products.stream()
                .filter(product -> product.getPrice() > 1000)
                .filter(product -> "electronics".equalsIgnoreCase(product.getCategory()))
                .collect(Collectors.toList());
    }
}
