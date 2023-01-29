package concurrency.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class AssignManagerTask {
    public static void main(String args[]) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(2);

        DevTeam teamDevA = new DevTeam(countDownLatch, "DEV-A");
        DevTeam teamDevB = new DevTeam(countDownLatch, "DEV-B");

        teamDevA.start();
        teamDevB.start();

        countDownLatch.await();

        QATeam qaTeam = new QATeam("QA");
        qaTeam.start();
    }
}
