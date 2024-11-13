package homework_nr_4;

public class TemperatureConverter {

    public static double toCelsius(int fahrenheit){
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    public static double toFahrenheit(int celsius){
        return (celsius * 1.8) + 32;
    }

    public static void main(String[] args) {
        TemperatureConverter converter = new TemperatureConverter();

        System.out.println("Конвертация из °F -> °C: " + converter.toCelsius(121) + "°C");
        System.out.println("Конвертация из °C -> °F: " + converter.toFahrenheit(38) + "°F");
    }
}
