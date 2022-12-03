package my.packet.wrapper_classes;

public class FloatWrapper {
    public static void main(String[] args) {
        Float obj = new Float("34.5");
        System.out.println(obj);

        obj = new Float(123.34);
        System.out.println(obj);

//      Float ref = 12; compilation error -- int to Float
        Float ref = Float.valueOf(12);
        System.out.println(ref);
        // or
        ref = 12f;
        System.out.println(ref);
        float number = 13.4f;
        ref = number;
        System.out.println(ref);

        byte bit = 12;
//      ref = bit; compilation error

        ref = bit + 0.3f;
    }
}
