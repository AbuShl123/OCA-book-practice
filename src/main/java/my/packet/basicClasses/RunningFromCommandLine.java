package my.packet.basicClasses;

public class RunningFromCommandLine {
    public static long main(String[] args) {
        System.out.println("Hello");
        return 5;
    }

    // Q: what happens when running this program?
    // A: Error at runtime. Because there's no proper main method
}
