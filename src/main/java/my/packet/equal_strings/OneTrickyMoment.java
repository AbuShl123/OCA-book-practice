package my.packet.equal_strings;

public class OneTrickyMoment {
    public static void main(String[] args) {
        String a = "";
        a += 2;
        a += 'c';
        a += false;
        System.out.println(a);

        System.out.println(a == "2cfalse"); // why false ?

        /*
        explanation:
            The print statement on line 11 prints false because the two
            String objects are not the same in memory. One comes directly from the string pool
            and the other comes from building using String operations.
         */

        String aa = "2cfalse";
        System.out.println(aa == a); // does not equal for the same reasons
        System.out.println(aa == "2cfalse"); // but there prints true
    }
}
