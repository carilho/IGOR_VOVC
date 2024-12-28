package homework_nr_19;

public class Main {
    public static void main(String[] args) {
        Thread evenThread = new ThreadEven();
        Runnable oddRunnable = new OddRunnable();
        Thread oddThread = new Thread(oddRunnable);

        evenThread.start();
        oddThread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        evenThread.interrupt();
        oddThread.interrupt();
    }
}
