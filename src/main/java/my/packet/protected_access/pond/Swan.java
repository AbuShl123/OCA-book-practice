package my.packet.protected_access.pond;

import my.packet.protected_access.bird.Bird;

public class Swan extends Bird {
    public void swim() {
        floatInWater();
        System.out.println(text);
    }

    public void helpOtherSwanToSwim() {
        Swan other = new Swan();
        other.floatInWater();
        System.out.println(other.text);
    }

    public void helpOtherBirdToSwim() {
        Bird bird = new Bird();
//      bird.floatInWater(); // does not compile
//      System.out.println(bird.text); // does not compile
    }
}
