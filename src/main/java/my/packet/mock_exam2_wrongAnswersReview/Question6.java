package my.packet.mock_exam2_wrongAnswersReview;

public class Question6 {
    String title;
    int value;
    public Question6() {
        title += "World";
    }

    public Question6(int value) {
        this.value = value;
        title = "Hello ";
//      Question6(); // I did stupid mistake and didn't notice this compile-error line
    }
}
