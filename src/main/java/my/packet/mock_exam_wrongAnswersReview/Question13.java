package my.packet.mock_exam_wrongAnswersReview;

public class Question13 {
    public static void main(String[] args) {
        // this one is pretty shameful.

        int x = 100;
        int a = x++;
        int b = ++x;
        int c = x++;
//      int d = (a < b) ? (a < c) ? a : (b < c) ? b : c; // Compilation error which I didn't notice
//      System.out.println(d);
    }
}

