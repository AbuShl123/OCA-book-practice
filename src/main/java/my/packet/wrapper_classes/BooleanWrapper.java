package my.packet.wrapper_classes;

public class BooleanWrapper {
    public static void main(String[] args) {
        Boolean b = new Boolean("false value");
        System.out.println(b);

        if (b=true) {
            System.out.println("that's true");
        } else {
            System.out.println("This will not run ever");
        }

        boolean bol = b;

        boolean primitiveOne = false;
        b = primitiveOne;
        System.out.println(primitiveOne + " == " + b);
    }
}
