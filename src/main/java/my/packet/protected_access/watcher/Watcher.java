package my.packet.protected_access.watcher;

import my.packet.protected_access.pond.Goose;
import my.packet.protected_access.pond.Swan;

public class Watcher {
    public void testGoose() {
        Goose goose = new Goose();
        //goose.floatInWater(); // cannot access to this method
        //goose.text; // does not compile for same reasons
    }

    public void testSwan() {
        Swan swan = new Swan();
        // swan.floatInWater();
        // swan.text;
    }
}
