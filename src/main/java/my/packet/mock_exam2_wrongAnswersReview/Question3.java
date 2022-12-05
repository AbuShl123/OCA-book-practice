package my.packet.mock_exam2_wrongAnswersReview;

public class Question3 {
    public static void go (Short n) {
        System.out.print("Short ");
    }
    public static void go (Long n) {
        System.out.print("Long ");
    }
    public static void go (int n) {
        System.out.print("int ");
    }

    public static void main(String[] args) {
        short y = 6;
        long z = 7;
        go(y);
        go(z);
        // my answer was "int short". and it was correct
        // seems like web-site managers did mistake
    }
}
