package task08;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

public class Task implements Runnable {
    private final AtomicInteger value;
    private CountDownLatch latch;

    public Task(int value) {
        this.value = new AtomicInteger(value);
    }

    public void setLatch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void inc() {
        value.getAndIncrement();
    }

    public int getValue() {
        return value.intValue();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000000; i++) {
            inc();
        }
        latch.countDown();
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
