/*
Создайте коллекцию мужских и женских имен с помощью интерфейса List - добавьте повторяющиеся значения
Получите уникальный список Set на основании List
Определите наименьший элемент (алфавитный порядок)
Определите наибольший элемент (по количеству букв в слове но в обратном порядке)
Удалите все элементы содержащие букву ‘A’
 */
package task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aleksey");
        names.add("Ivan");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Maksim");
        names.add("Anna");
        names.add("Anna");
        names.add("Olga");
        names.add("Olga");
        names.add("Kseniya");
        names.add("Anastasiya");
        names.add("Svetlana");
        names.sort(String::compareTo);
        System.out.println(names);

        Comparator<String> comparatorLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() > o2.length()) {
                    return 1;
                } else if (o1.length() < o2.length()) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        };

        names.sort(comparatorLength);
        System.out.println(names);

        names.sort(Comparator.reverseOrder());
        System.out.println(names);

        Set<String> setStr = new HashSet<>(names);
        System.out.println(setStr);

        names.sort(Comparator.naturalOrder());
        System.out.println(names.get(0));

        names.removeIf(name -> name.contains("a"));
        System.out.println(names);
    }
}
