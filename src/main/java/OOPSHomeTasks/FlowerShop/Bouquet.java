package OOPSHomeTasks.FlowerShop;
import java.util.ArrayList;
import java.util.List;

public class Bouquet
{
    private List<Flowers> flowers;

    public Bouquet() {
        this.flowers = new ArrayList<>();
    }
    public void addFlower(Flowers flower) {
        flowers.add(flower);
    }
    public double calculateCost() {
        double totalCost = 0;
        for (Flowers flower : flowers) {
            totalCost += flower.getCost();
        }
        return totalCost;
    }

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();

        bouquet.addFlower(new Rose());
        bouquet.addFlower(new Jasmine());
        bouquet.addFlower(new Lily());
        bouquet.addFlower(new Rose());

        double totalCost = bouquet.calculateCost();
        System.out.printf("The total cost of the bouquet is: Rs%.2f%n", totalCost);
    }
}
