package my.packet.method_chaining;
import java.time.LocalTime;

import static my.packet.method_chaining.Announcement.*;

public class TestAnnouncement {
    public static void main(String[] args) {
        please().come().back().in(0, 15); // after 15 minutes

        please().come().back().before(14, 33); // at 14:33

        please().come().back().at(LocalTime.of(14, 0));

    }
}
