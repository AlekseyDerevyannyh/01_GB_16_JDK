import java.util.Random;

public class Philosopher extends Thread {
    private static int counter = 0;
    private final int id;
    private final SingleTable table;

    {
        id = ++counter;
    }

    public Philosopher(SingleTable table) {
        this.table = table;
    }

    private Random rnd = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            lunch();
            thinking();
        }
        System.out.printf("Philosopher %d finished\n", id);
    }

    private void lunch() {
        try {
            while (!table.sitAtTheTable(this)) {}
            System.out.printf("Philosopher %d began to have lunch\n", id);
            Thread.sleep(500);
            System.out.printf("Philosopher %d finished lunch\n", id);
            table.leaveTheTable(this);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void thinking() {
        try {
            System.out.printf("Philosopher %d began to think\n", id);
            Thread.sleep(rnd.nextInt(500, 2000));
            System.out.printf("Philosopher %d finished thinking\n", id);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public boolean equals(Object philosopher) {
        if (this.getId() == ((Philosopher)philosopher).getId()) {
            return true;
        } else {
            return false;
        }
    }
}
