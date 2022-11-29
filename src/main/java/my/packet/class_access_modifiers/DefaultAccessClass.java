package my.packet.class_access_modifiers;

class DefaultAccessClass {
    public String text = "hi";
    protected String getText() { // it doesn't really have sense to create a protected method though
      // because anyway it's impossible for a class outside this package to inherit DefaultAccessClass.
        return this.text;
    }
}

final class Neighbour { // why final? Just like that
    static // hey!.. tricky right? reference is static type actually
    DefaultAccessClass reference; // we can do so, because we are within the same file!

    public static void main(String[] args) {
        System.out.println(reference.text);
        String $_$ = reference.getText();
    }
}