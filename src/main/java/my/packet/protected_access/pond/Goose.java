package my.packet.protected_access.pond;

import my.packet.protected_access.bird.Bird;

public class Goose extends Bird {
    private void swim() {
        Goose goose = new Goose();
        goose.floatInWater();
        System.out.println(goose.text);
    }

    private void another() {
        Bird ref = new Goose();
        // ref.floatInWater(); // does not compile
        // ref.text; // does not compile
    }
}
