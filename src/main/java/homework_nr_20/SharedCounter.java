package homework_nr_20;

public class SharedCounter {
    private int counter = 0;

    public synchronized void increment() {
        counter++;
    }

    public void safeIncrement() {
        synchronized (this) {
            counter++;
        }
    }

    public synchronized int getCounter() {
        return counter;
    }
}
