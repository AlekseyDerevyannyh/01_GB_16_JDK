package task07;

import task03.TicTak;

import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) {
        Thread tic = new Thread(new task03.TicTak("["));
        Thread tac = new Thread(new TicTak("]"));
        tic.start();
        tac.start();
    }
}
