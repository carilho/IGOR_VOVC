package homework_nr_6;

public class ArrayUtils {
    public static void main(String[] args) {
    int[] array1 = {25,43,52,11,0,-9,26,150,431,420};

    int max = findMax(array1);
        System.out.println("Максимальное число в массиве: " + max);
    int min = findMin(array1);
        System.out.println("Минимальное число в массиве: " + min);
    }

    public static int findMax(int[] numbers){
        int maximalNumber = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] > maximalNumber) {
                maximalNumber = numbers[i];
            }
    }
        return maximalNumber;
    }

    public static int findMin(int[] numbers){
        int minimalNumber = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if (numbers[i] < minimalNumber) {
                minimalNumber = numbers[i];
            }
        }
        return minimalNumber;
    }
}
