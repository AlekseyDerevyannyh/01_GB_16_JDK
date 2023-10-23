package task01;

import java.util.Scanner;

import static java.lang.System.*;

public class StatsHelper {
    private static int cnt = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread readThread = new Thread(() -> {
            Scanner in = new Scanner(System.in);
            while (in.hasNextLine() && !Thread.interrupted()) {
                in.nextLine();
                cnt++;
            }
        });
        readThread.setDaemon(true);
        readThread.start();
        readThread.interrupt();
        while (true) {
            out.println(cnt + " messages inputted by user");
            Thread.sleep(1000);
        }

    }
}
