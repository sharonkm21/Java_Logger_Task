package OOPSHomeTasks.FlowerShop;

public abstract class Flowers {
    private String name;
    private double cost;
    public Flowers(String name, double cost) {
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
