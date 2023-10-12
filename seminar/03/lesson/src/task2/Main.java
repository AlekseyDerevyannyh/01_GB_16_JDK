/*
Описать собственную коллекцию – список на основе массива. Коллекция должна иметь
возможность хранить любые типы данных, иметь методы добавления и удаления элементов.
*/

package task2;

public class Main {
    public static void main(String[] args) {
        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
        paramCollection.print();
        paramCollection.add(2.0);
        paramCollection.add(1.0);
        paramCollection.add(3.0);
        paramCollection.print();
        paramCollection.delete(0);
        paramCollection.print();
    }
}
