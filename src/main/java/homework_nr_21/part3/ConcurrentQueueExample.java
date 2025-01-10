package homework_nr_21.part3;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentQueueExample {
    public static void main(String[] args) {
        ConcurrentLinkedQueue<Integer> queue = new ConcurrentLinkedQueue<>();
        for (int i = 1; i <= 10; i++) {
            queue.add(i);
        }

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Runnable task = () -> {
            while (!queue.isEmpty()) {
                Integer number = queue.poll();
                if (number != null) {
                    int result = number * 2;
                    System.out.println("Thread: " + Thread.currentThread().getId() + ", Number: " + number + ", Result: " + result);
                }
            }
        };

        for (int i = 0; i < 4; i++) {
            executorService.execute(task);
        }

        executorService.shutdown();
        while (!executorService.isTerminated()) {
        }

        System.out.println("All tasks completed successfully.");
    }
}