package my.packet.times;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class Periods {
    public static void main(String[] args) {
        Period period = Period.ofWeeks(2);
        LocalTime time = LocalTime.now();
     // System.out.println(time.plus(period)); // runtime exception -- UnsupportedTemporalTypeException: Unsupported unit: Days

        LocalDate date = LocalDate.now();
        System.out.println(date);
        System.out.println("after two weeks: " + date.plus(period));

     // System.out.println(date.plusDays(period)); // plusDates and all other precise plus() methods get as a parameter long type only

        Period y_m_d = Period.of(1, 2, 3);
        System.out.println("after one year, two months and three days: " + date.plus(y_m_d));
    }
}
