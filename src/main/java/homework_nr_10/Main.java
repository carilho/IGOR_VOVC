package homework_nr_10;

public class Main {
    public static void main(String[] args) {
        Animal anElephant = new Elephant();
        System.out.println("Using interface:");
        System.out.println("Diet: " + Animal.DIET);
        anElephant.eat();
        anElephant.sleep();
        anElephant.communicate();
        anElephant.move();
        anElephant.info();
        Animal.staticInfo();

        System.out.println("\nUsing abstract class:");
        Herbivore herbivoreElephant = new HerbivoreElephant();
        herbivoreElephant.drinkWater();
        herbivoreElephant.graze();

        System.out.println("\nUsing HerbivoreElephant class:");
        HerbivoreElephant herbivoreElephant2 = new HerbivoreElephant();
        herbivoreElephant2.eat();
        herbivoreElephant2.sleep();
        herbivoreElephant2.communicate();
        herbivoreElephant2.move();
    }
}