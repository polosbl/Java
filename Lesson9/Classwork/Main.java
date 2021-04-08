package Lesson9.Classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        try {
            Divide.divide(65,0);
        } catch (ArithmeticException e) {
            System.out.println("на ноль делить нельзя!");
        }

        Divide.method();

        System.out.println(DateAndTime.localDateTime());
        System.out.println(DateAndTime.localDateTime(LocalDateTime.now()));

        Function<String, Integer> var = s ->  {
           return s.length();
        };
        System.out.println(var.apply("asd"));
        System.out.println(var.apply("asdaa"));
        System.out.println(var.apply(""));

        LocalDate localDate1 = LocalDate.of(2020,1,1);
        LocalDate localDate2 = LocalDate.of(2021,1,1);
        LocalDate localDate3 = LocalDate.of(2022,1,1);
        LocalDate localDate4 = LocalDate.of(2023,1,1);
        LocalDate localDate5 = LocalDate.of(2024,1,1);

        List<LocalDate> list = new ArrayList<>();
        list.add(localDate1);
        list.add(localDate2);
        list.add(localDate3);
        list.add(localDate4);
        list.add(localDate5);

        System.out.println(DateAndTime.dates(list).toString());
        System.out.println(DateAndTime.years(list).toString());

        System.out.println(DateAndTime.dates(localDate1,localDate2,localDate3,localDate4,localDate5).toString());

    }
}
