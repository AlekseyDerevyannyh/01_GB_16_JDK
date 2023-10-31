public class Main {
    public static void main(String[] args) {
        SingleTable table = new SingleTable();

        for (int i = 0; i < 5; i++) {
            new Philosopher(table).start();
        }
    }
}
