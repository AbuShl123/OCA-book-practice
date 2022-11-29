package my.packet.protected_access.pond;

import my.packet.protected_access.bird.Bird;

public class Swan extends Bird {
    private void swim() {
        floatInWater();
        System.out.println(text);
    }

    private void helpOtherSwanToSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    private void helpOtherBirdToSwim() {
        Bird bird = new Bird();
//      bird.floatInWater(); // does not compile
//      System.out.println(bird.text); // does not compile
    }
}
