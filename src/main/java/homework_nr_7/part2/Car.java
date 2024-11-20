package homework_nr_7.part2;

public class Car extends Vehicle {

    private int numberOfDoors;
    private boolean isElectric;

    public Car(String brand, String model, int year, int numberOfDoors, boolean isElectric) {
        super(brand, model, year);
        this.numberOfDoors = numberOfDoors;
        this.isElectric = isElectric;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("numberOfDoors: " + getNumberOfDoors() + "\n" + "isElectric: " + isElectric());
    }
}
