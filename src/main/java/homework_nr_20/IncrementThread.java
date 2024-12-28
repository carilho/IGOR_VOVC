package homework_nr_20;

public class IncrementThread extends Thread {
    private SharedCounter sharedCounter;

    public IncrementThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedCounter.increment();
        }
    }
}
