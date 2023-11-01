package lesson_39;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeAppl {
    public static void main(String[]args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate gagarin = LocalDate.of(1961, 4, 12);
        System.out.println(gagarin);
        System.out.println(gagarin.getDayOfMonth());
        System.out.println(gagarin.getDayOfWeek());
        System.out.println(gagarin.getDayOfYear());
        System.out.println(localDate.isAfter(gagarin));
        System.out.println(localDate.isBefore(gagarin));
        System.out.println(gagarin.isBefore(gagarin));
        System.out.println(gagarin.isBefore(gagarin));

    }
}
