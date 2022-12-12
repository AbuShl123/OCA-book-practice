package my.packet.operator_and_decisionConstructs;

public class Sequence {
    public static void main(String[] args) {
        new Sequence().method();

        int b = 4;

        Integer a = new Integer(3);
    }

    int ml(int i) {
        int j = 0;
        for (; j < 3; j++) {
            i = i+j;
        }
        return i;
    }

    void method() {
        int i = 5;
        i += i + ml(i) + ++i;
        System.out.println(i);
    }
}
