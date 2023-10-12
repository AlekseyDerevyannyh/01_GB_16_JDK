package task2;

public class ParamCollection<T> {
    private T[] array;
    private int index = 0;
    private int size;

    public ParamCollection(T[] array) {
        this.array = array;
        this.size = array.length;
    }

    public void add(T item) {
        if (index < size) {
            array[index] = item;
            index++;
        } else
            throw new RuntimeException("Array is Full!");
    }

    public void delete(int index) {
        array[index] = null;
    }

    public void print() {
        for (T t : array) {
            System.out.printf(t + " ");
        }
        System.out.println();
    }
}
