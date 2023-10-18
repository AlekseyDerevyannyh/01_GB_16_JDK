/*
Создать класс справочник сотрудников, который содержит внутри коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
Табельный номер
Номер телефона
Имя
Стаж
Добавить метод, который ищет сотрудника по стажу (может быть список)
Добавить метод, который выводит номер телефона сотрудника по имени (может быть список)
Добавить метод, который ищет сотрудника по табельному номеру
Добавить метод добавление нового сотрудника в справочник сотрудников
 */
package task4;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        NoteEmployee note = new NoteEmployee(10);
        Employee employee1 = new Employee("1234", "Petr", LocalDateTime.of(2020, 8, 23, 5, 5));
        Employee employee2 = new Employee("1235", "Aleksey", LocalDateTime.of(2021, 8, 23, 5, 5));
        Employee employee3 = new Employee("1236", "Marina", LocalDateTime.of(2023, 8, 23, 5, 5));
        Employee employee4 = new Employee("1237", "Lena", LocalDateTime.of(2022, 8, 23, 5, 5));

        note.add(employee1);
        note.add(employee2);
        note.add(employee3);
        note.add(employee4);
        System.out.println(note);

        System.out.println(note.getEmployeeByExperience(3));
        System.out.println(note.getPhoneByName("Marina"));
        System.out.println(note.getEmployeeById(2));
    }
}
