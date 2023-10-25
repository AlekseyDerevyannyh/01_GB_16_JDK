package task03;

public class Task implements Runnable {
    private final int value;

    public Task(int value) {
        this.value = value;
    }

    @Override
    public void run() {
        System.out.println(value);
    }

    @Override
    public String toString() {
        return String.format("(%s)", value);
    }
}
