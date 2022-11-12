package my.packet.exceptions_unit;

public class ExampleOfERROR {
    static { // when an exception occurs inside static initializer --> ExceptionInInitializerError is thrown.
        int[] arr = new int[3];
        System.out.println(arr[-1]);
    }

    static void run(){
        System.out.println("run");
    }

    public static void main(String[] args) {
        ExampleOfERROR.run();
    }
}
