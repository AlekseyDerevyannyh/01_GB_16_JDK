package task06;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        Task task = new Task(0);
        CountDownLatch latch = new CountDownLatch(3);
        task.setLatch(latch);
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(task);
            thread.start();
        }
        latch.await();
        System.out.println(task.getValue());
        long end = System.currentTimeMillis();
        System.out.println("Time: " + (end - start) + " ms.");
    }
}
