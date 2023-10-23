package thread;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            new MyThread().start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(new MyRunnable()).start();
        }

        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                System.out.println("3. Hello from " + Thread.currentThread());
            }).start();
        }

        Thread tic = new Thread(new TicTak("["));
        Thread tac = new Thread(new TicTak("]"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
