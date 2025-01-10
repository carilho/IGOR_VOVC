package homework_nr_21.part1;

public class SharedBuffer {
    private int buffer;
    private boolean isEmpty = true;

    public synchronized void produce(int value) throws InterruptedException {
        while (!isEmpty) {
            wait();
        }
        buffer = value;
        isEmpty = false;
        System.out.println("Produced: " + value);
        notifyAll();
    }

    public synchronized int consume() throws InterruptedException {
        while (isEmpty) {
            wait();
        }
        int value = buffer;
        isEmpty = true;
        System.out.println("Consumed: " + value);
        notifyAll();
        return value;
    }
}
