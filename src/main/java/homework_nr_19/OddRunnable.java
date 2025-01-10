package homework_nr_19;

public class OddRunnable implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            System.out.println("Odd number: " + (count * 2 + 1));
            count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}