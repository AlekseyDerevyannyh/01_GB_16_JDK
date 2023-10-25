package task09;

import task03.TicTak;

public class Main {
    public static void main(String[] args) {
        Thread tic = new Thread(new TicTak("["));
        Thread tac = new Thread(new TicTak("]"));
        tic.start();
        tac.start();
    }
}
