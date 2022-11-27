package my.packet.times;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Practice1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, Month.JANUARY, 20);
        date = date.plusDays(11);
        System.out.println(date);
        date = date.plusMonths(1);
        System.out.println(date);
        date = date.plusDays(1);
        System.out.println(date);

        System.out.println("-------------------------");

        LocalDate date2 = LocalDate.of(2019, 1, 20);
        System.out.println(date2);
        date2 = date2.plusDays(10);
        System.out.println(date2);
        date2 = date2.plusYears(1);
        System.out.println(date2);
        date2 = date2.plusMonths(1);
        System.out.println(date2);
    }
}
