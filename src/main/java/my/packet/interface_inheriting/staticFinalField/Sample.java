package my.packet.interface_inheriting.staticFinalField;

public class Sample implements IInt {
    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.theValue;
        int k = IInt.theValue;
        int i = theValue;
        System.out.println("done.");
        // compiles and runs without any problem

    }
}

interface IInt {
    int theValue = 0;
}