/*
Создайте телефонный справочник с помощью Map - телефон это ключ, а имя значение
Найдите человека с самым маленьким номером телефона
Найдите номер телефона человека чье имя самое большое в алфавитном порядке
 */
package task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Main {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();
        phoneBook.put("1230", "Petr");
        phoneBook.put("1235", "Ivan");
        phoneBook.put("1236", "Aleksey");
        phoneBook.put("1237", "Anna");
        phoneBook.put("1238", "Olga");
        phoneBook.put("1239", "Maksim");

        Integer phoneMin = null;

        for (String user : phoneBook.keySet()) {
            if (phoneMin == null) {
                phoneMin = Integer.parseInt(user);
            } else {
                if (Integer.parseInt(user) < phoneMin)
                    phoneMin = Integer.parseInt(user);
            }
        }
        System.out.println(phoneMin);

        List<Map.Entry<String, String>> users = new ArrayList<>(phoneBook.entrySet());
        users.sort(Map.Entry.comparingByValue());
        System.out.println(users);
    }
}
