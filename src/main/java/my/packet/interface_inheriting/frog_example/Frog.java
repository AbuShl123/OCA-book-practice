package my.packet.interface_inheriting.frog_example;

public class Frog implements CanHop{
    public static void main(String[] args) {
        TurtleFrog turtleFrog = new TurtleFrog();

        Frog frog = new TurtleFrog();

        CanHop canHop = new TurtleFrog();

        Object o = canHop;
    }
}
