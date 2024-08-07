package OOPSHomeTasks.PizzaHomeTask;
import OOPSHomeTasks.FlowerShop.Jasmine;
import OOPSHomeTasks.FlowerShop.Lily;
import OOPSHomeTasks.FlowerShop.Rose;

import java.util.ArrayList;
import java.util.List;

public class Pizza
{
    private PizzaBase base;
    private List<PizzaToppings> toppings;

    public Pizza(PizzaBase base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(PizzaToppings topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double totalCost = base.getCost();
        for (PizzaToppings topping : toppings) {
            totalCost += topping.getCost();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Pizza pizza = new Pizza(new PizzaBase("Cheese Crust",10.00));

        pizza.addTopping(new PizzaToppings("Mushroom",4.50));
        pizza.addTopping(new PizzaToppings("Onion",1.99));
        pizza.addTopping(new PizzaToppings("Feta Cheese",3.50));
        pizza.addTopping(new PizzaToppings("Red Sauce",2.50));

        double totalCost = pizza.calculateCost();
        System.out.printf("The total cost of the pizza is: Rs%.2f%n", totalCost);
    }
}
