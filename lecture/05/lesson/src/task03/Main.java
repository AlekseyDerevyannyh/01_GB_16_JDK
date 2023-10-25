package task03;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        for (int i = 0; i < 3; i++) {
            MyThread thread = new MyThread();
            thread.start();
            thread.join();
        }

        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(new MyRunnable());
            thread.start();
            thread.join();
        }

//        for (int i = 0; i < 3; i++) {
//            new Thread(() -> {
//                System.out.println("3. Hello from " + Thread.currentThread());
//            }).start();
//        }

        Thread tic = new Thread(new TicTak("["));
        Thread tac = new Thread(new TicTak("]"));
//        tic.setDaemon(true);
//        tac.setDaemon(true);
        tic.start();
        tac.start();
    }
}
