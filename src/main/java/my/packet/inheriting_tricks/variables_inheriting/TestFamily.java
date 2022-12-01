package my.packet.inheriting_tricks.variables_inheriting;

public class TestFamily {
    public static void main(String[] args) {
        Child_one child = new Child_one();
        System.out.println("child.name = " + child.name);
        child.printInfo();

        ParentClass parent = new Child_one();
        System.out.println("parent.name = " + parent.name);
        parent.printInfo();

        ParentClass parentButChild = new Child_one();
        System.out.println("parentButChild.name = " + parentButChild.name); // prints I'ma parent
        parentButChild.printInfo();

        // this is surprisingly for me prints "I'ma parent" in all three cases.
        System.out.println("--------------------------------------");
        // but now let's test with method Overriding

        Child_overrides child_but_overrides = new Child_overrides();
        System.out.println("child_but_overrides.name = " + child_but_overrides.name);
        child_but_overrides.printInfo();

        ParentClass parentBut_childOverrides = new Child_overrides();
        System.out.println("parentBut_childOverrides.name = " + parentBut_childOverrides.name);
        parentBut_childOverrides.printInfo();

        System.out.println("now printSuper");
        child.printSuper();
        child_but_overrides.printSuper();

    }
}

class Child_overrides extends ParentClass {
    public String name = "I'ma child";

    @Override
    public void printInfo() {
        System.out.println(name);
    }

    public void printSuper() {
        System.out.println(super.name);
    }
}