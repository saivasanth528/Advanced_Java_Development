package concurrency.locks;

public class SyncCounter {
    private int count;

    // implicit lock
    public synchronized void increment() {
        count++;

        // we can use synchronised block also
    }

    public synchronized int getCount() {
        return count;
    }
}
