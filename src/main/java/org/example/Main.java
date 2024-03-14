package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.Locale;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        //TASK1
        System.out.println(Calculator1.sum(2, 2.3));
        System.out.println(Calculator1.subtract(2, 2.3));
        System.out.println(Calculator1.divide(2, 2.3));
        System.out.println(Calculator1.multiply(2, 2.3));


        // TASK2
        ArrayList list1 = new ArrayList<>();
        ArrayList list2 = new ArrayList<>();

        list1.add("a;lskdjf");
        list2.add("Jakl");

        System.out.println("Проверка строк с разным значением");
        System.out.println(ArraysCompareUtils.compareArrays(list1,list2));

        Month month = Month.SEPTEMBER;
        Month month1 = Month.APRIL;

        list1.add(month);
        list2.add(month1);

        System.out.println("Проверка месяцев с разным значением");
        System.out.println(ArraysCompareUtils.compareArrays(list1,list2));

        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();

        list1.add(localDate);
        list2.add(localTime);

        System.out.println("Проверка сравнения класса времени с классом даты");
        System.out.println(ArraysCompareUtils.compareArrays(list1,list2));

        //TASK3

        Pair pair = new Pair<>(10, list1);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);

    }

}