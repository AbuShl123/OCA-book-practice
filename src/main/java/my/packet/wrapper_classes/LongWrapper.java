package my.packet.wrapper_classes;

public class LongWrapper {
    public static void main(String[] args) {
        String myStr = "1234";

        long l1 = new Long(myStr); // although it is deprecated, it still works

        long l2 = Long.parseLong(myStr); // also works

        long l3 = Long.valueOf(myStr).longValue(); // and this one also works

        // Long class has method longValue();
        // it's unboxing the value of Long.

//      Long o = new Long(); Long class has no non-arg constructor (as well as all other wrappers)

        long number = (new Long(23)).parseLong(myStr); // pretty funny yea?
        System.out.println(number);
    }
}
