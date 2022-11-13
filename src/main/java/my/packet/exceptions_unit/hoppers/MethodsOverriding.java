package my.packet.exceptions_unit.hoppers;

public class MethodsOverriding {
    public static void main(String[] args) {
        Parent parent = new Parent();

        try {
            parent.method();
        } catch (InterruptedException e) {
            System.out.println("handled");
        }

        Child child = new Child();

        try {
            child.method();
        } catch (InterruptedException e) {
            System.out.println("Handled");
        }

        child.runtimeExcMethod(); // gives no problems. We don't have to handle the method which throws a RuntimeException

    }
}

class Parent {
    public void method() throws InterruptedException{
        System.out.println("method in parent");
    }
}

class Child extends Parent{
    @Override
    public void method() throws InterruptedException, RuntimeException {
        System.out.println("method in child");
    }

    public void runtimeExcMethod() throws NumberFormatException {
        System.out.println("runtime exception may be thrown");
    }
}