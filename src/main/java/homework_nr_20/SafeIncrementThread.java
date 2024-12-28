package homework_nr_20;

public class SafeIncrementThread extends Thread {
    private SharedCounter sharedCounter;

    public SafeIncrementThread(SharedCounter sharedCounter) {
        this.sharedCounter = sharedCounter;
    }

    public void run() {
        for (int i = 0; i < 1000; i++) {
            sharedCounter.safeIncrement();
        }
    }
}
