package homework_nr_11;

import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Hw11 {
    public static Predicate<Integer> isOdd = chislo -> chislo % 2 != 0;
    public static Consumer<String> showRow = row -> System.out.println("We print this line");
    public static Function<Integer, Integer> multiplication = number -> number * 2;
    public static Supplier<Integer> randomchik = () -> new Random().nextInt(1000);


public static void testEmployee(Employee e, Predicate<Employee> testMethod) {
    if (testMethod.test(e)) {
        System.out.println("Passed for: " + e.getName() + " " + e.getSurname());
    } else {
        System.out.println("Failed for: " + e.getName() + " " + e.getSurname());
    }
}

    public static Predicate<Employee> isSoftwareEngineer = u -> "Software Engineering".equals(u.getDepartment());
    public static Predicate<Employee> isAdult = u -> u.getAge() > 20;
    public static Predicate<Employee> nameStartsWithA = u -> u.getName().startsWith("A");
}

