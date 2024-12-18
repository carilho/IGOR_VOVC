package homework_nr_17;

public class Car extends Vehicle {
    private String fuelType;

    public Car(String model, int year, String fuelType) {
        super(model, year);
        this.fuelType = fuelType;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return super.toString() + ", Fuel: " + fuelType;
    }
}
