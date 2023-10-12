/*
 Написать итератор по массиву. Итератор – это объект, осуществляющий движение по коллекциям любого типа,
 содержащим любые типы данных. Итераторы обычно имеют толькодва метода – проверка на наличие следующего
 элемента и переход к следующему элементу. Но также, особенно в других языках программирования, возможно
 встретить итераторы, реализующие дополнительную логику.
*/

package task3;

import task2.ParamCollection;

public class Main {
    public static void main(String[] args) {
        ParamCollection<Double> paramCollection = new ParamCollection<>(new Double[10]);
        paramCollection.print();
        paramCollection.add(2.0);
        paramCollection.add(1.0);
        paramCollection.add(3.0);
        paramCollection.add(2.0);
        paramCollection.add(1.0);
        paramCollection.add(3.0);
        paramCollection.print();
        for (Double item : paramCollection) {
            System.out.println(item);
        }
    }
}
