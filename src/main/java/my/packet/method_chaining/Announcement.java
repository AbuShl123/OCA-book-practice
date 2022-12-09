package my.packet.method_chaining;

import java.time.LocalTime;
import java.time.Period;

public class Announcement { // announcement
    private Announcement() {}

    public static Announcement please() {
        return new Announcement();
    }

    public Announcement come() {
        return this;
    }

    public Announcement back() {
        return this;
    }

    public Announcement in(int h) {
        return this;
    }

    public Announcement in(int h, int m) {
        return this;
    }

    public Announcement in(int h, int m, int s) {
        return this;
    }

    public Announcement in(Period period) {
        return this;
    }

    public Announcement at(String time) {
        return this;
    }

    public Announcement at(int h, int m) {
        return this;
    }

    public Announcement at(int h, int m, int s) {
        return this;
    }

    public Announcement at(LocalTime time) {
        return this;
    }

    public Announcement before(String time) {
        return this;
    }

    public Announcement before(int h, int m) {
        return this;
    }

    public Announcement before(int h, int m, int s) {
        return this;
    }

    public Announcement before(LocalTime time) {
        return this;
    }
}
