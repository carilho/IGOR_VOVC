package homework_nr_7.part2;

public class Motorcycle extends Vehicle {

    private double engineCapacity;
    private boolean hasABS;

    public Motorcycle(String brand, String model, int year, double engineCapacity, boolean hasABS) {
        super(brand, model, year);
        this.engineCapacity = engineCapacity;
        this.hasABS = hasABS;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public boolean isHasABS() {
        return hasABS;
    }

    public void setHasABS(boolean hasABS) {
        this.hasABS = hasABS;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("engineCapacity: " + getEngineCapacity() + "\n" + "hasABS: " + isHasABS());
    }
}