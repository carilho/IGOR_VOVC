package homework_nr_12;

import java.util.function.Predicate;

public enum CheckInteger {
    CHECK_IF_ODD(n -> n % 2 != 0),
    CHECK_IF_EVEN(n -> n % 2 == 0),
    CHECK_IF_NEGATIVE(n -> n < 0),
    CHECK_IF_POSITIVE(n -> n > 0);

    private Predicate<Integer> checkCondition;

    CheckInteger(Predicate<Integer> checkCondition) {
        this.checkCondition = checkCondition;
    }

    public boolean check(int number) {
        return checkCondition.test(number);
    }

    public static void printCheckExamples() {
        int testNumber = 1234567890;
        System.out.println(testNumber + " is odd? " + CHECK_IF_ODD.check(testNumber));
        System.out.println(testNumber + " is positive? " + CHECK_IF_POSITIVE.check(testNumber));
    }
}
