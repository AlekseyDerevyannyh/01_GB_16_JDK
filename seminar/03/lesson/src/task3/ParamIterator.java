package task3;

import task2.ParamCollection;

import java.util.Iterator;

public class ParamIterator<T> implements Iterator<T> {
    private final ParamCollection<T> collection;
    private int index = 0;

    public ParamIterator(ParamCollection<T> collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.getSize();
    }

    @Override
    public T next() {
        T result =  collection.getByIndex(index);
        index++;
        return result;
    }
}
