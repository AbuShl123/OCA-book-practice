package my.packet.protected_access.bird;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }
}
