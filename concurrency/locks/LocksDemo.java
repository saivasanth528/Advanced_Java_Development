package concurrency.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class LocksDemo {

    private Counter counter = new Counter();
    private SyncCounter syncCounter = new SyncCounter();
    private LockedCounter lockedCounter = new LockedCounter();
    private AtomicCounter atomicCounter = new AtomicCounter();

    public void demoCounter() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(counter::increment));
        executorService.shutdown();
        System.out.println("Counter count = " + counter.getCount());
    }

    public void demoSyncCounter() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(syncCounter::increment));
        executorService.shutdown();
        System.out.println("syncCounter count = " + syncCounter.getCount());
    }

    public void demoLockedCounter() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(lockedCounter::increment));
        executorService.shutdown();
        System.out.println("DemoLockCounter count = " + lockedCounter.getCount());
    }

    public void demoAtomicCounter() {
        ExecutorService executorService = Executors.newCachedThreadPool();
        IntStream.range(0, 1000)
                .forEach(i -> executorService.submit(atomicCounter::increment));
        executorService.shutdown();
        System.out.println("AtomicCounter count = " + atomicCounter.getCount());
    }


    public static void main(String args[]) {
        LocksDemo locksDemo = new LocksDemo();
        locksDemo.demoCounter();
        locksDemo.demoSyncCounter();
        locksDemo.demoLockedCounter();
        locksDemo.demoAtomicCounter();
    }
}
