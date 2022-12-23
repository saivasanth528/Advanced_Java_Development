package concurrency.countdownlatch;


public class QATeam extends Thread{

    public QATeam(String name) {
        super(name);
    }

    public void run() {
        System.out.println("Task assigned to " + Thread.currentThread().getName());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Task finished by " + Thread.currentThread().getName());
    }
}
