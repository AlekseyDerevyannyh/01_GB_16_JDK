package task1;

import java.io.DataInput;
import java.io.Serializable;

public class FirstClass<T extends Comparable, V extends DataInput, K extends Number> {
    T comparableItem;
    V dataItem;
    K numberItem;

    FirstClass(T comparableItem, V dataItem, K numberItem) {
        this.comparableItem = comparableItem;
        this.dataItem = dataItem;
        this.numberItem = numberItem;
    }

    void getNameClass() {
        System.out.println(comparableItem.getClass().getName());
        System.out.println(dataItem.getClass().getName());
        System.out.println(numberItem.getClass().getName());
    }

}
