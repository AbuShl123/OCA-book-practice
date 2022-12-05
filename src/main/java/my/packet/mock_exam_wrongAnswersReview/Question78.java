package my.packet.mock_exam_wrongAnswersReview;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Question78 {
    // that's a total shame!
    public static void main(String[] args) {
        // what the following code outputs?
        LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
        dt.plusDays(30); // intelliJ says that the result of this method is ignored, but it wasn't that obvious on plaint text!
        dt.plusMonths(1);
        System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
        /*
        output: 2014-09-30
        but I completely forgot that Local times and dates are all immutable.
        so my answer was: 2014-09-30
         */
    }
}
