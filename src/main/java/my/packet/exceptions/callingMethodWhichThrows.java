package my.packet.exceptions;

public class callingMethodWhichThrows {
    public static void main(String[] args) throws Exception {
        // main method calls m1()
        try {
            m1();
        }
        finally {
            System.out.println("finally");
        }
        // but it does not handle the exception which is thrown in m1()
        // the exception is thrown at runtime no matter of throws Exception clause in main method signature
    }

    public static void m1() throws Exception {
        throw new Exception(); // the method throws an exception
        // but it moves the responsibility of handling this exception to the caller
    }
}
