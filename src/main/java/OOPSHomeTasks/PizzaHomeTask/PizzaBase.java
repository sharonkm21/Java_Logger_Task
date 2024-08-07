package OOPSHomeTasks.PizzaHomeTask;

public class PizzaBase
{
    private String name;
    private double cost;
    public PizzaBase(String name, double cost) {
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
