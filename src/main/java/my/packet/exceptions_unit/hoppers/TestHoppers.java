package my.packet.exceptions_unit.hoppers;

public class TestHoppers {
    public static void main(String[] args) {
        Hopper hopper = new Hopper();
        try {
            hopper.hop(); // without try-catch block it would not compile
        } catch (CanNotHopeException e) {
            System.out.println("Cannot hope");
        }

        Bunny bunny = new Bunny();

        bunny.hop(); // there we don't have to handle checked exception
    }
}
