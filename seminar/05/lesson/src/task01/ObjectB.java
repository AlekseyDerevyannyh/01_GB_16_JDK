package task01;

public class ObjectB {
    private int value = 20;

    public synchronized int getValue() throws InterruptedException {
        Thread.sleep(5000);
        return value;
    }

    public synchronized void setValue(int value) {
        this.value = value;
    }
}
