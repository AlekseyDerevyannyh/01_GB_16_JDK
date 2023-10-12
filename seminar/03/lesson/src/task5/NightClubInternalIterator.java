package task5;

import task2.ParamCollection;
import task4.Person;

import java.util.Iterator;

public class NightClubInternalIterator<T extends Person> implements Iterable<T> {
    private T[] community;

    public NightClubInternalIterator(T[] community) {
        this.community = community;
    }

    public void partyForAll() {
        for (T t : community) {
            t.haveRest();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ParamIterator<T>();
    }

    class ParamIterator<T> implements Iterator<T> {
        private int index = 0;


        @Override
        public boolean hasNext() {
            return index < community.length;
        }

        @Override
        public T next() {
            T result = (T) community[index];
            index++;
            return result;
        }
    }
}
