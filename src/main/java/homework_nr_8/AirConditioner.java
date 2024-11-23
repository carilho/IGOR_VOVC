package homework_nr_8;

public class AirConditioner extends Appliance {

    int coolingPower;
    boolean hasInverter;

    public AirConditioner(String brand, int power, int coolingPower, boolean hasInverter) {
        super(brand, power);
        this.coolingPower = coolingPower;
        this.hasInverter = hasInverter;
    }

    @Override
    public String turnOn() {
        return "Air conditioner is now cooling the room.";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Cooling power: " + coolingPower + " BTU");
        System.out.println("hasInverter: " + hasInverter);
    }
}
