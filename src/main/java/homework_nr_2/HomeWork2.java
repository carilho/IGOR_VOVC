package homework_nr_2;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        long CurrentWorldPopulation = 7811080815L;
        int CarsProducedThisYear = 55235358;
        char FirstLetterInAlphabet = 'A';
        boolean JavaIsAmazing = true;
        float Pi = 3.14159F;

        System.out.println(CurrentWorldPopulation);
        System.out.println(CarsProducedThisYear);
        System.out.println(FirstLetterInAlphabet);
        System.out.println(JavaIsAmazing);
        System.out.println(Pi);

        double Price = 3.123;
        double Tax = 0.21;
        int Quantity = 25;
        double Sum = 0;

        System.out.println(Price);
        System.out.println(Tax);
        System.out.println(Quantity);
        System.out.println(Sum);

        double total = Price + Tax * Quantity + Sum;
        System.out.println(total);
    }
}
