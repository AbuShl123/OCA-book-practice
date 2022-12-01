package my.packet.contructors.with_inheriting;

public class ChildClass extends ParentClass {

    public ChildClass() {
        super(5);
//      this("word"); // Call to 'this()' must be first statement in constructor body
    }

    public ChildClass(int num) {
        this(); // ok that works fine, we don't have to use super(); if we are already calling another constructor which calls to super(); before
    }

    public ChildClass(String word) {
        this(10); // and we can do like that
    }

}
