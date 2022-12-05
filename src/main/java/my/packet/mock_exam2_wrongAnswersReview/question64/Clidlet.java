package my.packet.mock_exam2_wrongAnswersReview.question64;

public class Clidlet extends Clidder{
    public final void flipper() { // we are overriding a method from parent. Because method is private in Parent
        System.out.println("Clidlet");
    }

    public static void main(String[] args) {
        new Clidlet().flipper();
    }
}
// no compilation errors
