package homework_nr_10;

public interface Animal {
        String DIET = "Herbivore";

        void eat();
        void sleep();
        void communicate();
        void move();

        default void info() {
            System.out.println("Animals are beautiful creatures.");
        }

        static void staticInfo() {
            System.out.println("Animals have diverse diets.");
        }
    }
