package homework_nr_21.part2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(() -> {
            long factorial = 1;
            for (int i = 1; i <= 5; i++) {
                factorial *= i;
            }
            System.out.println("[STARTED] Thread: " + Thread.currentThread().getId() + ", Task: Calculate Factorial of 5");
            System.out.println("[Finished] Thread: " + Thread.currentThread().getId() + ", [Result]: " + factorial);
        });

        executorService.execute(() -> {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            System.out.println("[STARTED] Thread: " + Thread.currentThread().getId() + ", Task: Sum of first 10 numbers");
            System.out.println("[Finished] Thread: " + Thread.currentThread().getId() + ", [Result]: " + sum);
        });

        executorService.execute(() -> {
            String str = "Executor";
            String reversed = new StringBuilder(str).reverse().toString();
            System.out.println("[STARTED] Thread: " + Thread.currentThread().getId() + ", Task: Reverse String 'Executor'");
            System.out.println("[Finished] Thread: " + Thread.currentThread().getId() + ", [Result]: " + reversed);
        });

        executorService.execute(() -> {
            int num = 29;
            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            System.out.println("[STARTED] Thread: " + Thread.currentThread().getId() + ", Task: Check if 29 is Prime");
            System.out.println("[Finished] Thread: " + Thread.currentThread().getId() + ", [Result]: " + (isPrime ? "Prime" : "Not Prime"));
        });

        executorService.execute(() -> {
            int[] array = {1, 5, 3, 9, 2};
            int max = array[0];
            for (int i : array) {
                if (i > max) {
                    max = i;
                }
            }
            System.out.println("[STARTED] Thread: " + Thread.currentThread().getId() + ", Task: Find Maximum in Array");
            System.out.println("[Finished] Thread: " + Thread.currentThread().getId() + ", [Result]: " + max);
        });

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }
        System.out.println("All tasks completed successfully.");
    }
}