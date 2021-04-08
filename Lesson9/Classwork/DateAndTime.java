package Lesson9.Classwork;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DateAndTime {
    public static String localDateTime() {
        LocalDate dateTime = LocalDate.now();
        LocalTime time = LocalTime.now();
        return dateTime.getDayOfMonth() + "." + dateTime.getMonthValue() + "." + dateTime.getYear() + " " +
                time.getHour() + ":" + time.getMinute() + ":" + time.getSecond();
    }

    public static LocalDateTime localDateTime(LocalDateTime localDateTime) {
        return localDateTime.plusHours(4).plusMinutes(30);
    }

    public static List dates(LocalDate... dates) {
        List<LocalDate> list = new ArrayList<>();
        for (LocalDate localDate : dates) {
            list.add(localDate);
        }

        list.sort((localDate1, localDate2) -> {
            if (localDate1.getDayOfMonth() - localDate2.getDayOfMonth() > 0) {
                return 1;
            } else if (localDate1.getDayOfMonth() - localDate2.getDayOfMonth() == 0) {
                return 0;
            } else {
                return -1;
            }
        });

        return list;
    }

    public static List dates(List<LocalDate> dates) {
        return dates.stream()
                .filter(localDate -> localDate.isAfter(LocalDate.now()))
                .collect(Collectors.toList());
    }

    public static Set<Integer> years (List<LocalDate> dates) {
        return dates.stream()
                .map(localDate ->
                    localDate.getYear()
                )
                .collect(Collectors.toSet());
    }
}
