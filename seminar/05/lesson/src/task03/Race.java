package task03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    private List<Runner> competitors;
    private volatile boolean prepare = false;
    private volatile boolean start = false;
    private volatile boolean stop = false;
    private int distance = 100;


    public Race(Runner... competitors) {
        this.competitors = new ArrayList<>();
        Collections.addAll(this.competitors, competitors);
    }

    public void setThreads() {
        for (Runner competitor : competitors) {
            Runnable run = () -> {
                while (!prepare) {
                    try {
                        Thread.sleep(10);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                competitor.setReady();
                while (!stop) {
                    if (start) {
                        competitor.run(distance);
                    }
                }
            };
            Thread thread = new Thread(run);
            thread.start();
        }
    }

    public void start() {
        try {
            prepare = true;
            int flag = 0;

            while (flag != competitors.size()) {
                flag = 0;
                for (Runner competitor : competitors) {

                    if (competitor.isReady()) {
                        flag ++;
                    }
                }
            }
            System.out.println("Everybody are ready!");

            System.out.println("Ready");
            Thread.sleep(1000);
            System.out.println("Steady");
            Thread.sleep(1000);
            System.out.println("Go!!!");
            start = true;

            int allDone = 0;

            while (allDone != competitors.size()) {
                for (Runner competitor : competitors) {
                    if (competitor.getDistance() == distance) {
                        allDone++;
                    }
                }
            }
            System.out.println("Everybody finished!");
            stop = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
