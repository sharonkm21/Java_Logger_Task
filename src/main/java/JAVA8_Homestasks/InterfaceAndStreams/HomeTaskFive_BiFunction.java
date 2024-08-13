package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.Map;
import java.util.function.BiFunction;

public class HomeTaskFive_BiFunction
{
    public static void main(String[] args) {
        System.out.println("1 : Creating a new product with only name and price");
        BiFunction<String, Double, Product> createProduct = (name, price) ->
                new Product(name, price, "Unknown", "Standard");

        Product product1 = createProduct.apply("Laptop", 1500.0);
        Product product2 = createProduct.apply("Headphones", 120.0);

        System.out.println(product1);
        System.out.println(product2);
        System.out.println();

        System.out.println("2 : BiFunction to calculate the cost of products");

        BiFunction<Product, Integer, Double> calculateCost = (product, quantity) ->
                product.getPrice() * quantity;

        Map<Product, Integer> cart = Map.of(
                new Product("Laptop", 1500.0, "Electronics", "Standard"), 2,
                new Product("Headphones", 120.0, "Electronics", "Standard"), 5
        );

        double totalCost = cart.entrySet().stream()
                .mapToDouble(entry -> calculateCost.apply(entry.getKey(), entry.getValue()))
                .sum();

        System.out.println("Total Cost of the Cart: " + totalCost);
    }
}
