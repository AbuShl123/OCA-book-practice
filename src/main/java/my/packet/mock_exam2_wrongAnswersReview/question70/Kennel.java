package my.packet.mock_exam2_wrongAnswersReview.question70;

public class Kennel {
    public static void main(String[] args) {
        Beagle b1 = new Beagle();
        Dog dog1 = new Dog();
        Dog dog2 = b1;

        Beagle b2 = (Beagle) dog1;
        Beagle b3 = (Beagle) dog2;

        // everything compiles. The question asked me to choose only compiling options
        // I didn't mark option on line 9 as correct and thus lost a point
        // because although this option gives exception at runtime the question asks me to compile successfully
    }
}
