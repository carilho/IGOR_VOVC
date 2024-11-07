package homework_nr_3;

public class HomeWork3 {
    public static void main(String[] args) {

            int monthNumber = 3;

            switch (monthNumber){
            case 0:
                System.out.println("Month with number 0 does not exist");
                break;
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Not a valid number for month, try 1-12");
        }

            for (int i = 100; i <= 1000; i++) {
                if (i % 5 == 0) {
                    System.out.println(i);
                }
            }

            double sum = 0;
            for (double i = 1; i <= 97; i+=2) {
                double delitel = i + 2;
                double ResultDelenia = i / delitel;
                sum += ResultDelenia; }
                System.out.println(sum);
                }
            }
