package JAVA8_Homestasks.InterfaceAndStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HomeTaskTwo_Predicates {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500.0, "Electronics", "A"));
        products.add(new Product("Book", 15.0, "Books", "B"));
        products.add(new Product("Headphones", 90.0, "Electronics", "A"));
        products.add(new Product("Pen", 5.0, "Stationery", "C"));

        List<Response> responses = new ArrayList<>();
        responses.add(new Response("Success", 200, "XML"));
        responses.add(new Response("Error", 400, "JSON"));
        responses.add(new Response("Failure", 500, "JSON"));
        responses.add(new Response("Not Found", 404, "XML"));

        // 1. Predicate to check if the price of the product is greater than 1000
        System.out.println("Task 1: Predicate to check if the price of the product is greater than 1000");
        Predicate<Product> priceGreaterThan1000 = p -> p.getPrice() > 1000;
        products.stream()
                .filter(priceGreaterThan1000)
                .forEach(System.out::println);
        System.out.println();

        // 2. Predicate to check if the product is of the electronics category
        System.out.println("Task 2 : Predicate to check if the product is of the electronics category");
        Predicate<Product> isElectronics = p -> p.getCategory().equalsIgnoreCase("Electronics");
        products.stream()
                .filter(isElectronics)
                .forEach(System.out::println);
        System.out.println();

        // 3. Products with price > 100 and in electronics category
        System.out.println("Task 3 : Products with price > 100 and in electronics category");
        Predicate<Product> priceGreaterThan100 = p -> p.getPrice() > 100;
        products.stream()
                .filter(priceGreaterThan100.and(isElectronics))
                .forEach(System.out::println);
        System.out.println();


        // 4. Products with price > 100 or in electronics category
        System.out.println("4 : Products with price greater than 100 or in electronics category:");
        products.stream()
                .filter(priceGreaterThan100.or(isElectronics))
                .forEach(System.out::println);
        System.out.println();

        // 5. Products with price < 100 and in electronics category
        System.out.println("5 : Products with price less than 100 and in electronics category:");
        Predicate<Product> priceLessThan100 = p -> p.getPrice() < 100;
        products.stream()
                .filter(priceLessThan100.and(isElectronics))
                .forEach(System.out::println);
        System.out.println();

        // 6. Predicate to check if the status code is 400
        System.out.println("4 : Responses with status code 400:");
        Predicate<Response> statusCode400 = r -> r.getStatusCode() == 400;
        responses.stream()
                .filter(statusCode400)
                .forEach(System.out::println);
        System.out.println();

        // 7. Predicate to check if the response type is JSON
        System.out.println("7 : Responses with response type JSON:");
        Predicate<Response> responseTypeJson = r -> "JSON".equalsIgnoreCase(r.getResponseType());
        responses.stream()
                .filter(responseTypeJson)
                .forEach(System.out::println);
        System.out.println();

        // 8. Responses with status code 400 and response type JSON
        System.out.println("8 : Responses with status code 400 and response type JSON:");
        responses.stream()
                .filter(statusCode400.and(responseTypeJson))
                .forEach(System.out::println);
        System.out.println();

        // 9. Responses with status code 400 or response type JSON
        System.out.println("9 : Responses with status code 400 or response type JSON:");
        responses.stream()
                .filter(statusCode400.or(responseTypeJson))
                .forEach(System.out::println);
        System.out.println();

        // 10. Responses with status code not 400 and response type JSON
        System.out.println("10 : Responses with status code not 400 and response type JSON:");
        responses.stream()
                .filter(statusCode400.negate().and(responseTypeJson))
                .forEach(System.out::println);
        System.out.println();

    }
}

