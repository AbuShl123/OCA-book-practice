package my.packet.protected_access.bird;

public class Bird {
    protected String text = "floating";
    protected void floatInWater() {
        System.out.println(text);
    }

    private void helpOtherBird() {
        Bird otherBird = new Bird();
        otherBird.floatInWater();
        System.out.println(otherBird.text);
    }
}
