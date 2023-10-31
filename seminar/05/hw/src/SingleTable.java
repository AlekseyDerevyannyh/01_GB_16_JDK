public class SingleTable {
    private Philosopher philosopher;

    public synchronized boolean sitAtTheTable(Philosopher philosopher) {
        if (this.philosopher == null) {
            this.philosopher = philosopher;
            return true;
        } else {
            return false;
        }
    }

    public synchronized void leaveTheTable(Philosopher philosopher) {
        if (this.philosopher.equals(philosopher)) {
            this.philosopher = null;
        }
    }
}
