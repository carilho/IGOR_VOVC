package homework_nr_14;

public class Main {
    public static void main(String[] args) {
        try {
            Airplane airplane1 = createAirplaneLBYL("", "747", 4);
            Airplane airplane2 = createAirplaneEAFP("Airbus", "A320", 5);
            System.out.println(airplane1);
            System.out.println(airplane2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int count = countDivisibleBy7Numbers(7, 5);
            System.out.println("Count of numbers divisible by 7: " + count);
        } catch (InvalidRangeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static Airplane createAirplaneLBYL(String manufacturer, String model, int nrOfEngines) {
        if (manufacturer == null || manufacturer.isEmpty()) {
            System.out.println("Invalid manufacturer");
            return null;
        }
        if (model == null || model.isEmpty()) {
            System.out.println("Invalid model");
            return null;
        }
        if (nrOfEngines == 0 || nrOfEngines % 2 != 0) {
            System.out.println("Invalid number of engines");
            return null;
        }
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    public static Airplane createAirplaneEAFP(String manufacturer, String model, int nrOfEngines) {
        try {
            return new Airplane(manufacturer, model, nrOfEngines);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static int countDivisibleBy7Numbers(int inferiorLimit, int superiorLimit) throws InvalidRangeException {
        if (inferiorLimit > superiorLimit) {
            throw new InvalidRangeException("Invalid range: inferior limit is greater than superior limit");
        }
        int count = 0;
        for (int i = inferiorLimit; i <= superiorLimit; i++) {
            if (i % 7 == 0) {
                count++;
                System.out.println(i);
            }
        }
        return count;
    }
}


