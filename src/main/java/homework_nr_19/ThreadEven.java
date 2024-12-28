package homework_nr_19;

public class ThreadEven extends Thread {
    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            if (Thread.currentThread().isInterrupted()) {
                return;
            }
            System.out.println("Even number: " + (count * 2));
            count++;
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
}
