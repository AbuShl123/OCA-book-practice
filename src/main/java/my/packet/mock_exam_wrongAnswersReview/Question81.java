package my.packet.mock_exam_wrongAnswersReview;

public class Question81 {
    public static void main(String[] args) {
        // totally there were 84 questions. And that's my last wrong answer
        int i = 10;
        int j = 20;
        int k = j += i / 5;
        System.out.println(i + " : " + j + " : " + k);
        /*
        here I did a basic mistake: j += (i/5) and then it's assigned to k
        my answer was 10:30:6
        which is not correct.
         */
    }
}
