package my.packet.inheriting_tricks.variables_inheriting;

public class ParentClass {
    public String name = "I'ma parent";

    public void printInfo() {
        System.out.println(name); // this method prints $name variable from parent class
    }
}

class Child_one extends ParentClass{
    public String name = "I'ma child"; // overriding a variable??
    // what happens if we create object of Child_one and call printInfo() method?
    // see in TestFamily.java

    public void printThis() {
        System.out.println(this.name);
    }

    public void printSuper() {
        System.out.println(super.name);
    }
}


