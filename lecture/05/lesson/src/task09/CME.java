package task09;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class CME {
    public static void main(String[] args) {
        List<Integer> list = new CopyOnWriteArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }
        Runnable r1 = () -> {
            for (int i = 0; i < 100; i++) {
                list.add(i);
            }
        };
        Runnable r2 = () -> {
            for (Integer value : list) {
                System.out.print(value + " ");
            }
            System.out.println();
        };
        new Thread(r1).start();
        new Thread(r2).start();
    }
}
