package task03;

import java.util.Random;

public class Runner {
    private boolean ready = false;
    private int distance = 0;

    private Random rnd = new Random();

    public void setReady() {
        try {
            Thread.sleep(rnd.nextInt(1000));
            this.ready = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void run(int finish) {
        try {
            while (distance < finish) {
                Thread.sleep(rnd.nextInt(10));
                distance++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isReady() {
        return ready;
    }

    public int getDistance() {
        return distance;
    }
}
