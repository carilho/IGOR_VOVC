package homework_nr_17;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void copyVehicles(List<? extends Vehicle> source, List<? super Vehicle> destination) {
        destination.addAll(source);
    }

    public static void main(String[] args) {
        Vehicle tesla = new Vehicle("Tesla", 2023);
        Vehicle ford = new Vehicle("Ford", 2017);
        Car bmw = new Car("BMW M4 for Gherman", 2022, "Petrol");

        Storage<Vehicle> vehicleStorage = new Storage<>();
        vehicleStorage.addItem(tesla);
        vehicleStorage.addItem(ford);

        Storage<Vehicle> carStorage = new Storage<>();
        carStorage.addItem(bmw);

        Warehouse<Vehicle> warehouse = new Warehouse<>();
        warehouse.addStorage(vehicleStorage);
        warehouse.addStorage(carStorage);

        System.out.println("Quantity of all vehicles: " + warehouse.getTotalItemCount());

        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(tesla);
        vehicles.add(ford);
        vehicles.add(bmw);

        List<Vehicle> copiedVehicles = new ArrayList<>();
        copyVehicles(vehicles, copiedVehicles);
        System.out.println("Copied vehicles:");
        for (Vehicle vehicle : copiedVehicles) {
            System.out.println(vehicle);
        }

        Predicate<Vehicle> isRecent = vehicle -> vehicle.getYear() > 2018;
        List<Vehicle> recentVehicles = FilterUtils.filter(vehicles, isRecent);
        System.out.println("Vehicles released after 2018:");
        for (Vehicle vehicle : recentVehicles) {
            System.out.println(vehicle);
        }
    }
}
