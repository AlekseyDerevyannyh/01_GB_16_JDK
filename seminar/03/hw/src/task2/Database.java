package task2;

import java.util.Collection;

public interface Database<T> {
    Collection<T> getAll();
    void add(T data);
    void delete(T data);
}
