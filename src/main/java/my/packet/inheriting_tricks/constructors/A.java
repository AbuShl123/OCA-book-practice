package my.packet.inheriting_tricks.constructors;

public class A {
    public A() { print(); }
    public void print() {
        System.out.println("A ");
    }
}

class B extends A {
    int i = 4;

    public void print() {
        System.out.print(i + " ");
    }

    public static void main(String[] args) {
        A a = new B();
        a.print();
    }

    // wow! the output is 0 4!
}
