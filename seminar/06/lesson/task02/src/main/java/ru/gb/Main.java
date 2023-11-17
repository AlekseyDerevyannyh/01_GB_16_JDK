/*
Создать свой Java Gradle проект;
Добавить зависимость Guava (популярная библиотека от Google, содержащая набор утилитарных механизмов).
Воспользоваться утилитарным классом Lists:
Развернуть список элементов
Получить лист Character из строки
Разделить лист на группы по 2 элемента
Воспользоваться утилитарным классом Sets
Получить итоговый Set из двух коллекций
Получить итоговый Set из общих элементов двух коллекций
Получить итоговый Set из непересекающихся элементов двух коллекций
 */
package ru.gb;

import com.google.common.collect.Lists;
import com.google.common.collect.Sets;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Character> list = Lists.charactersOf("abcdef");
        List<Character> list2 = Lists.charactersOf("defghij");
        System.out.println(list);
        List<List<Character>> list1 = Lists.partition(list, 2);
        System.out.println(list1);

        Set<Character> set1 = new HashSet<>(list);
        Set<Character> set2 = new HashSet<>(list2);
        System.out.println(Sets.union(set1, set2));
        System.out.println(Sets.intersection(set1, set2));
        System.out.println(Sets.symmetricDifference(set1, set2));
    }
}