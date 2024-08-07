package OOPSHomeTasks.NewYearGift;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gift
{
    private List<Confectionary> items;

    public Gift() {
        this.items = new ArrayList<>();
    }

    public void addItem(Confectionary item) {
        items.add(item);
    }
    public double calculateTotalWeight() {
        double totalWeight = 0;
        for (Confectionary item : items) {
            totalWeight += item.getWeight();
        }
        return totalWeight;
    }

    public List<Chocolate> getChocolates() {
        List<Chocolate> chocolates = new ArrayList<>();
        for (Confectionary item : items) {
            if (item instanceof Chocolate) {
                chocolates.add((Chocolate) item);
            }
        }
        return chocolates;
    }
    public List<Chocolate> sortChocolates(String sortBy) {
        List<Chocolate> chocolates = getChocolates();
        switch (sortBy.toLowerCase()) {
            case "weight":
                Collections.sort(chocolates, Comparator.comparingDouble(Chocolate::getWeight));
                break;
            case "sugar":
                Collections.sort(chocolates, Comparator.comparingDouble(Chocolate::getSugarContent));
                break;
            default:
                System.out.println("Invalid sorting parameter. Sorting by weight by default.");
                Collections.sort(chocolates, Comparator.comparingDouble(Chocolate::getWeight));
        }

        return chocolates;
    }

    public List<Chocolate> findCandiesBySugarContent(double minSugar, double maxSugar) {
        List<Chocolate> chocolates = getChocolates();
        List<Chocolate> result = new ArrayList<>();
        for (Chocolate chocolate : chocolates) {
            if (chocolate.getSugarContent() >= minSugar && chocolate.getSugarContent() <= maxSugar) {
                result.add(chocolate);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Gift gift = new Gift();

        // Add chocolates and sweets to the gift
        gift.addItem(new Chocolate("Galaxy", 20,30));
        gift.addItem(new Chocolate("Lindt Milk Chocolate", 25,20));
        gift.addItem(new Sweet("Ghee Ladoo", 15,4));
        gift.addItem(new Sweet("Jelebi", 10,6));
        gift.addItem(new Chocolate("Lindt Dark Chocolate", 22,15));

        // Calculate and print the total weight of the gift
        double totalWeight = gift.calculateTotalWeight();
        System.out.printf("Total weight of the gift: %.2f grams%n", totalWeight);
        System.out.println();

        System.out.println("Sorting Chocolates based on weight:");
        List<Chocolate> sortedChocolates = gift.sortChocolates("weight");
        for (Chocolate chocolate : sortedChocolates) {
            System.out.printf("%s: %.2f weight%n", chocolate.getName(), chocolate.getWeight());
        }
        System.out.println();

        System.out.println("Sorting Chocolates based on Sugar Content:");
        sortedChocolates =gift.sortChocolates("sugar");
        for (Chocolate chocolate : sortedChocolates) {
            System.out.printf("%s: %.2f grams of sugar%n", chocolate.getName(),chocolate.getSugarContent());
        }
        System.out.println();

        double minSugar = 15;
        double maxSugar = 22;
        List<Chocolate> filteredChocolates = gift.findCandiesBySugarContent(minSugar, maxSugar);
        System.out.printf("Chocolates with sugar content between %.2f and %.2f:%n", minSugar, maxSugar);
        for (Chocolate chocolate : filteredChocolates) {
            System.out.printf("%s: %.2f grams of sugar%n", chocolate.getName(), chocolate.getSugarContent());
        }
    }
}
