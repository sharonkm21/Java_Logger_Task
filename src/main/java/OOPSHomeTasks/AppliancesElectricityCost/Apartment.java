package OOPSHomeTasks.AppliancesElectricityCost;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Apartment {
    private List<Appliance> appliances;

    public Apartment() {
        this.appliances = new ArrayList<>();
    }

    public void addAppliance(Appliance appliance) {
        appliances.add(appliance);
    }

    public double calculateCurrentLoad() {
        double totalLoad = 0;
        for (Appliance appliance : appliances) {
            if (appliance.isOn()) {
                System.out.println(appliance.getName()+" is switched on.");
                totalLoad += appliance.getPowerConsumption();
            }
        }
        System.out.println();
        return totalLoad;
    }

    public List<Appliance> sortAppliances(String sortBy)
    {
        Comparator<Appliance> comparator;
        switch (sortBy.toLowerCase()) {
            case "name":
                comparator = Comparator.comparing(Appliance::getName);
                break;
            case "power":
                comparator = Comparator.comparingDouble(Appliance::getPowerConsumption);
                break;
            default:
                System.out.println("Invalid sorting parameter. Sorting by power consumption by default.");
                comparator = Comparator.comparingDouble(Appliance::getPowerConsumption);
        }
        List<Appliance> sortedAppliances = new ArrayList<>(appliances);
        Collections.sort(sortedAppliances, comparator);
        return sortedAppliances;
    }

    public List<Appliance> getAppliances() {
        return appliances;
    }

    public static void main(String[] args) {
        Apartment home = new Apartment();

        // Add appliances to the home
        Fan fan = new Fan("Havells",1.7);
        Bulb light = new Bulb("LG",0.5);
        Television tv = new Television("Samsung",1.5);
        Laptop laptop = new Laptop("HP",1.2);

        home.addAppliance(fan);
        home.addAppliance(light);
        home.addAppliance(tv);
        home.addAppliance(laptop);

        // Switch on some appliances
        fan.switchOn();
        light.switchOn();
        tv.switchOn();

        // Calculate and print the current load
        double currentLoad = home.calculateCurrentLoad();
        System.out.printf("Current power consumption: %.2f units%n", currentLoad);

        // Accept user input for sorting parameter
        List<Appliance> sortedAppliances = home.sortAppliances("power");
        System.out.println("Appliances sorted by power:");
        for (Appliance appliance : sortedAppliances) {
            System.out.printf("%s: %.2f units%n", appliance.getName(), appliance.getPowerConsumption());
        }

    }

}
