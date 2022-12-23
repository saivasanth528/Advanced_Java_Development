package concurrency.blockingqueue;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    private int id;
    private BlockingQueue<Message> queue;

    Producer(int id, BlockingQueue queue) {
        this.id = id;
        this.queue = queue;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            Message message = new Message(i);
            try {
                System.out.printf("Producer %d produced message %d\n", id, message.getId());
                queue.put(message);
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            queue.put(new Message(-1));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
