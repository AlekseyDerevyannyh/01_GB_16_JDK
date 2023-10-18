/*
Создайте коллекцию мужских и женских имен с помощью интерфейса List
Отсортируйте коллекцию в алфавитном порядке
Отсортируйте коллекцию по количеству букв в слове
Разверните коллекцию
 */

package task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Aleksey");
        names.add("Ivan");
        names.add("Oleg");
        names.add("Maksim");
        names.add("Anna");
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
    }
}
