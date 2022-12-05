package my.packet.mock_exam2_wrongAnswersReview.question32;

public class SubCalc extends SuperCalc{
    public static int multiply(int a, int b) {
        // int c = super.multiply(a, b); // compilation fails at this line
        return 0; // would be c instead of 0
    }

    /*
    (!!!!!) --> call super.anything is only for instance members!!! I forgot that.
     */
}
