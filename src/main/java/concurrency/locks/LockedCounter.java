package concurrency.locks;

import java.util.concurrent.locks.ReentrantLock;

public class LockedCounter {
    private int count;
    // explicit lock added in java 1.5
    private ReentrantLock reentrantLock = new ReentrantLock();

    public void increment() {
        reentrantLock.lock();
        try {
            count++;
        } finally {
            reentrantLock.unlock();
        }
    }

    public int getCount() {
        reentrantLock.lock();
        try {
            return count;
        } finally {
            reentrantLock.unlock();
        }
    }
}
