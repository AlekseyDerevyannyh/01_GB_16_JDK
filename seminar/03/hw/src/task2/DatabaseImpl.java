package task2;

import java.util.ArrayList;
import java.util.Collection;

public class DatabaseImpl<T> implements Database<T> {
    Collection<T> dataCollection;

    public DatabaseImpl() {
        this.dataCollection = new ArrayList<>();
    }

    @Override
    public Collection<T> getAll() {
        return this.dataCollection;
    }

    @Override
    public void add(T data) {
        this.dataCollection.add(data);
    }

    @Override
    public void delete(T data) {
        this.dataCollection.removeIf(item -> item.equals(data));
    }

    public void print() {
        for (T item : this.dataCollection) {
            System.out.print(item + " ");
        }
        System.out.println();
    }
}
