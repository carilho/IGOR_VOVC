package homework_nr_10;

class HerbivoreElephant extends Herbivore implements Animal {
    @Override
    public void eat() {
        System.out.println("Herbivore Elephant eats only plants.");
    }

    @Override
    public void sleep() {
        System.out.println("Herbivore Elephant rests under trees.");
    }

    @Override
    public void communicate() {
        System.out.println("Herbivore Elephant uses low-frequency sounds.");
    }

    @Override
    public void move() {
        System.out.println("Herbivore Elephant moves with its herd.");
    }

    @Override
    public void graze() {
        System.out.println("Herbivore Elephant grazes on fresh grass.");
    }
}
