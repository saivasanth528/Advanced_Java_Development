package concurrency.cyclic_barrier;

import java.util.concurrent.CyclicBarrier;

public class ClientTest {
    public static void main(String args[]) {
        System.out.println(Thread.currentThread().getName() + " has started");
        CyclicBarrier barrier = new CyclicBarrier(4);

        PassengerThread p1 = new PassengerThread(1000, barrier, "tony");
        PassengerThread p2 = new PassengerThread(2000, barrier, "peter");
        PassengerThread p3 = new PassengerThread(3000, barrier, "vision");
        PassengerThread p4 = new PassengerThread(4000, barrier, "natasha");

        PassengerThread p5 = new PassengerThread(1000, barrier, "cap");
        PassengerThread p6 = new PassengerThread(2000, barrier, "antman");
        PassengerThread p7 = new PassengerThread(3000, barrier, "sam");
        PassengerThread p8 = new PassengerThread(4000, barrier, "bucky");

        p1.start();
        p2.start();
        p3.start();
        p4.start();

        p5.start();
        p6.start();
        p7.start();
        p8.start();

        System.out.println(Thread.currentThread().getName() + " has finished");
    }
}
