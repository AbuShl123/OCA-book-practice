package my.packet.times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatters {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1987, Month.JANUARY, 3);
        System.out.println(date);
        System.out.println(date.format(DateTimeFormatter.ISO_DATE));

        LocalTime time = LocalTime.of(13, 40);
        System.out.println(time);
        System.out.println(time.format(DateTimeFormatter.ISO_LOCAL_TIME));

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        System.out.println(dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

        System.out.println("---------------------");
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);
//        System.out.println(formatter.format(date)); does not compile because formatter is localizedDateTime
        System.out.println(formatter.format(dateTime));
        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        System.out.println(formatter.format(dateTime));
//        System.out.println(date.format(formatter)); does not compile because formatter is only for DateTime


        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        LocalTime time2 = LocalTime.of(0, 55, 59, 123);
        System.out.println(time2);
        System.out.println(formatter.format(time2));
        System.out.println(time2.format(formatter));
    }
}
