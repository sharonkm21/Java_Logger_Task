package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.List;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeTaskThree_FunctionalInterface
{
    public static void main(String[] args) {
        // Create a list of Product objects
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", "A"));
        products.add(new Product("Book", 15.0, "Books", "B"));
        products.add(new Product("Headphones", 120.0, "Electronics", "A"));
        products.add(new Product("Pen", 5.0, "Stationery", "C"));
        products.add(new Product("Smartphone", 2000.0, "Electronics", "A"));

        // 1. Calculate the total cost of all products
        Function<List<Product>, Double> totalCostFunction = list ->
                list.stream().mapToDouble(Product::getPrice).sum();

        double totalCost = totalCostFunction.apply(products);
        System.out.println("Total cost of all products: " + totalCost);

        // 2. Calculate the total cost of products with price > 1000
        Function<List<Product>, Double> costGreaterThan1000Function = list ->
                list.stream().filter(p -> p.getPrice() > 1000).mapToDouble(Product::getPrice).sum();

        double costGreaterThan1000 = costGreaterThan1000Function.apply(products);
        System.out.println("Total cost of products with price > 1000: " + costGreaterThan1000);

        // 3. Calculate the total cost of electronic products
        Function<List<Product>, Double> electronicProductsCostFunction = list ->
                list.stream().filter(p -> "Electronics".equalsIgnoreCase(p.getCategory())).mapToDouble(Product::getPrice).sum();

        double electronicProductsCost = electronicProductsCostFunction.apply(products);
        System.out.println("Total cost of electronic products: " + electronicProductsCost);

        // 4. Get all products with price > 1000 and in electronic category
        Function<List<Product>, List<Product>> expensiveElectronicsFunction = list ->
                list.stream().filter(p -> p.getPrice() > 1000 && "Electronics".equalsIgnoreCase(p.getCategory())).collect(Collectors.toList());

        List<Product> expensiveElectronics = expensiveElectronicsFunction.apply(products);
        System.out.println("Products with price > 1000 and in electronics category:");
        expensiveElectronics.forEach(System.out::println);
    }
}
