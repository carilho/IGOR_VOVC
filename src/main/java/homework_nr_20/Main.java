package homework_nr_20;

public class Main {
    public static void main(String[] args) {
        SharedCounter counter = new SharedCounter();

        IncrementThread t1 = new IncrementThread(counter);
        SafeIncrementThread t2 = new SafeIncrementThread(counter);

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Schetchik final value: " + counter.getCounter());
    }
}
