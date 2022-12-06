package my.packet.mock_exam_test1_review;

public class Question2 {
    public static void main(String[] args) {
        char c;
        int i;
        c = 'a';//1
        i = c;  //2
        i++;    //3
//      c = i;  //4    DOESN't COMPILE!
        c++;    //5

        // so next:
        int intNum = 10;
//      char ch = intNum; does not compile

        char ch = 10; // compiles! wow, what a hell
    }
}
