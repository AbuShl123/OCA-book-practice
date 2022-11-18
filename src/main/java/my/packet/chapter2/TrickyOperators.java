package my.packet.chapter2;

public class TrickyOperators {
    public static void main(String[] args) {
        boolean a = false;
        if (a=true) System.out.println("success");
        else System.out.println("failure");

        /*
        it doesn't show an error! Try to think why, or look on code below which explains this phenomenon
         */

        int x = 34;
        int y = 10;
        int sum = 6 + (x=(10 + (y=4))); // It's fine to do so
        System.out.println("sum = " + sum);
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        int xx = 0;
        int yy = 0;
        if ((xx=20) == (yy=xx)) {
            System.out.println("true, xx=yy=" + xx);
        } else {
            System.out.println("xx = " + xx + ", yy = " + yy);
        }

        System.out.println(1%2);
    }
}
