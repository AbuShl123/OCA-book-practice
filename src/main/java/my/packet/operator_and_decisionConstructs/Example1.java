package my.packet.operator_and_decisionConstructs;

public class Example1 {
    public static void main(String[] args) {
        boolean b1 = false;
        boolean b2 = false;
        if (b2 = b1 != b2){   // b2 != b1 = !b2 wouldn't now compile. why? (see below)
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        /*
        Note that  boolean operators have more precedence than =.
        (In fact, = has least precedence of all operators.)
        so, in (b2 != b1 = !b2)  first b2 != b1 is evaluated which returns a value 'false'.
        So the expression becomes false = !b2. And this is illegal because false is a value and not a variable!
         */
    }
}
