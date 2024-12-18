package homework_nr_16;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog());
        animals.add(new Cat());

        AnimalShelter shelter = new AnimalShelter();
        System.out.println("Sounds for each animal in the list:");
        shelter.makeAllAnimalsSound(animals);

        List<Dog> dogs = new ArrayList<>();
        shelter.addDog(dogs, new Dog());
        shelter.addDog(dogs, new Dog());

        System.out.println("Dawgs sounds:");
        shelter.makeAllAnimalsSound(dogs);
    }
}
