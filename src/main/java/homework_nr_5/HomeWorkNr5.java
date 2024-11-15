package homework_nr_5;

public class HomeWorkNr5 {
    public static void main(String[] args) {
        int[] numbers = new int[101];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = 100 - i;
            System.out.println(numbers[i]);
        }

        int sum = 0;
        long multiplication = 1;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
               sum+=numbers[i];
            } else {
                multiplication*=numbers[i];
            }
        }
        System.out.println(sum);
        System.out.println(multiplication);

        int[] copyArray = new int[numbers.length];
            for(int i = 0; i < copyArray.length; i++){
                copyArray[i] = numbers[i];
            }
    }
}
