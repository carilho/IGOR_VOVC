package homework_nr_7.part2;

public class VehicleMain {
    public static void main(String[] args) {
        Car car1 = new Car("Tesla", "Model S", 2023, 4, true);
        Motorcycle moto1 = new Motorcycle("Yamaha", "YZF-RF3", 2011, 321.0, true);

        car1.displayInfo();
        System.out.println("----------------");
        moto1.displayInfo();
    }
}
