package OOPSHomeTasks.PizzaHomeTask;

public class PizzaToppings
{
    private String name;
    private double cost;
    public PizzaToppings(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public double getCost() {
        return cost;
    }
}
