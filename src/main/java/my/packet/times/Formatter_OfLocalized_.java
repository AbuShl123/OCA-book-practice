package my.packet.times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Formatter_OfLocalized_ {
    public static void main(String[] args) {
        DateTimeFormatter time_formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);

        DateTimeFormatter date_formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);

        DateTimeFormatter dateTime_formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);

        LocalDate date = LocalDate.of(1810, Month.APRIL, 5);
        LocalTime time = LocalTime.of(21, 0, 12);
        LocalDateTime dateTime = LocalDateTime.of(date, time);

        System.out.println(dateTime_formatter.format(dateTime));
        System.out.println(dateTime.format(time_formatter));
        System.out.println(dateTime.format(date_formatter));

        /*

        short_time --> shows only hours and minutes
        long_date --> prints name of months fully and year
        medium --> prints like long but new of month not fully


         */
    }
}
