package concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable {

    private int id;
    private BlockingQueue<Message> queue;

    public Consumer(int id, BlockingQueue<Message> queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        Message message;
        try {
            while ((message = queue.take()).getId() != -1) {
                System.out.printf("Consumer %d consumed %d\n", id, message.getId());
                Thread.sleep((int) (Math.random() * 100));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
