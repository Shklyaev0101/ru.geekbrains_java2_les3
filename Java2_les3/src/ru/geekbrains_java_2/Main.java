package ru.geekbrains_java_2;

//1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
// Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
// Посчитать сколько раз встречается каждое слово.
//2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров.
// В этот телефонный справочник с помощью метода add() можно добавлять записи. С помощью метода get() искать
// номер телефона по фамилии. Следует учесть, что под одной фамилией может быть несколько телефонов
// (в случае однофамильцев), тогда при запросе такой фамилии должны выводиться все телефоны.

import java.util.*;

public class Main {

    public static void main(String[] args) {
        String[] words = {"wow", "boom", "oh", "omg", "ha", "live", "love", "Work", "wow", "boom"};
        List<String> CountingWords = Arrays.asList(words);
        System.out.println(CountingWords);
        Set<String> uniqueWords = new HashSet<>(CountingWords);
        System.out.println(CountingWords);

        Map<String, Integer> occurrences = new HashMap<>();
        for (String w: CountingWords) {
            if (occurrences.containsKey(w)) {
                Integer occurrence = occurrences.get(w);
                occurrence++;
                occurrences.put(w, occurrence);
            } else
                occurrences.put(w, 1);
        }
        System.out.println(occurrences);
    }

}
