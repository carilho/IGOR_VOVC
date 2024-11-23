package homework_nr_8;

public class Microwave extends Appliance {

    boolean hasGrill;

    public Microwave(String brand, int power, boolean hasGrill) {
        super(brand, power);
        this.hasGrill = hasGrill;
    }

    @Override
    public String turnOn() {
        return "Microwave is now heating food.";
    }
}
