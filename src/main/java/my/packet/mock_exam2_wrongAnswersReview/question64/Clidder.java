package my.packet.mock_exam2_wrongAnswersReview.question64;

public class Clidder {
    private final void flipper() { // even IntelliJ itself says that it's pointless to make private method final
        // final - to prevent method from being overridden
        // but private already makes method inaccessible for other classes
        // which means makes it impossible to override a method
        System.out.println("Clidder");
    }
}
