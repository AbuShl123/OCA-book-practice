package my.packet.exceptions_unit;

public class NestedTryExample {
    public static void main(String[] args) {
        String b = "";
        String nullOne = null;

        try {
            try {
                b += "before ";
                nullOne.length();
                b += "after ";
            } catch (RuntimeException e) {
                b += "catch ";
                throw new ArithmeticException();
            } finally {
                throw new IllegalArgumentException();
            }
        } catch (ArithmeticException e) {
            b += "arithmetic ";
        } catch (IllegalArgumentException e) {
            b += "illegal_argument ";
        } catch (RuntimeException e) {
            b += "runtime ";
        }

        System.out.println(b);

    }
}
