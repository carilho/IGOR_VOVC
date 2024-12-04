package homework_nr_10;

class Elephant implements Animal {
    @Override
    public void eat() {
        System.out.println("Elephant eats grass.");
    }

    @Override
    public void sleep() {
        System.out.println("Elephant sleeps.");
    }

    @Override
    public void communicate() {
        System.out.println("Elephant trumps.");
    }

    @Override
    public void move() {
        System.out.println("Elephant is walking.");
    }
}
