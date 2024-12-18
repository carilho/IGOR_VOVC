package homework_nr_16;
import java.util.List;

public class AnimalShelter {
    public void addDog(List<? super Dog> animals, Dog dog) {
        animals.add(dog);
    }

    public void makeAllAnimalsSound(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}

