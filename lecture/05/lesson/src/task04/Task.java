package task04;

import java.util.concurrent.CountDownLatch;

public class Task implements Runnable {
    private int value;
    private CountDownLatch latch;

    public Task(int value) {
        this.value = value;
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void inc() {
        value++;
    }

    public int getValue() {
        return value;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100000; i++) {
            inc();
        }
        latch.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
