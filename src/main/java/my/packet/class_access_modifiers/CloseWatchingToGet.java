package my.packet.class_access_modifiers;

public class CloseWatchingToGet {
    public DefaultAccessClass defaultAccessClass; // wow, that works.
    // We can access it, 'cause we're within the same package as DefaultAccessClass
    public void printText() {
        System.out.println(defaultAccessClass.getText());
    }

    public String getText() {
        return defaultAccessClass.text;
    }
}
