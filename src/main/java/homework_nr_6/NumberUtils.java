package homework_nr_6;

public class NumberUtils {

    public static void main(String[] args) {
        int[] array1 = {25, 43, 52, 11, 0, -9, 26, 150, 431, 420, 1};
        findPrimesArray(array1);
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                return false;
            }
        }
                return true;
    }

    public static void findPrimesArray(int[] numbers){
            for(int i = 0; i < numbers.length; i++) {
                if (isPrime(numbers[i])){
                    System.out.println(numbers[i]);
                }
            }
        }

    }
