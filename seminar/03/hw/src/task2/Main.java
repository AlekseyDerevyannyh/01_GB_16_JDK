package task2;

import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        DatabaseImpl<String> db = new DatabaseImpl<>();
        db.add("first");
        db.add("second");
        db.add("third");
        db.print();

        Collection<String> db_copy = db.getAll();
        for (String item : db_copy) {
            System.out.print(item + ", ");
        }
        System.out.println();

        db.delete("second");
        db.print();
    }
}
