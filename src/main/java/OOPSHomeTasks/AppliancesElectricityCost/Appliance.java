package OOPSHomeTasks.AppliancesElectricityCost;

public class Appliance
{
    private String name;
    private double powerConsumption; // Power consumption in units
    private boolean isOn;

    public Appliance(String name, double powerConsumption) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.isOn = false;
    }
    public String getName() {
        return name;
    }
    public double getPowerConsumption() {
        return powerConsumption;
    }
    public boolean isOn() {
        return isOn;
    }
    public void switchOn() {
        isOn = true;
    }
    public void switchOff() {
        isOn = false;
    }
}
