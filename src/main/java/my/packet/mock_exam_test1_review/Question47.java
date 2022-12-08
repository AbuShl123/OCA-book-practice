package my.packet.mock_exam_test1_review;

public class Question47 {
    public static void main(String[] args) {
        // what will the code output?
        int i = 0;
        boolean bool1 = true;
        boolean bool2 = false;
        boolean bool = false;

        bool = ( bool2 &  method1(i++) ); //1
        bool = ( bool2 && method1(i++) ); //2
        bool = ( bool1 |  method1(i++) ); //3
        bool = ( bool1 || method1(i++) ); //4

        System.out.println(i);

    }

    public static boolean method1(int i) {
        return i>0 ? true : false;
    }
}
