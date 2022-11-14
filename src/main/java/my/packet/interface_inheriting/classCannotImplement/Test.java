package my.packet.interface_inheriting.classCannotImplement;

public class Test {
    public static void main(String[] args) {
        Child child = new Child();
        child.f();
    }
}

interface A1 {
    default void f() {
        System.out.println("A1");
    }
}

interface A2 {
    default void f() {
        System.out.println("A2");
    }
}

class Child implements A1, A2 {
    @Override
    public void f() { // if to delete f() method it will give a compile
        System.out.println("since two interfaces I implement have the same default methods" +
                " it means that I should whether give my own implementation to those methods or delete one of the interfaces from implementation part");
    }

}