package my.packet.object_casting_issues;

public class Example1 {
    public static void main(String[] args) {
        Object word = "hi";
        System.out.println(word);

//      String str = word; COMPILATION ERROR
//      since string is subclass of Object we need an explicit cast

        String str = (String) word;
        System.out.println(str);

        Object oNum = 4;
        int a = (int) oNum; // without explicit casting wouldn't compile
//      System.out.println(oNum + a); this is tricky one. Although both are numbers, this will not compile due to reason that they are different data types
        System.out.println((int) oNum + a);

        Integer integer = (Integer) oNum;
        System.out.println(integer + (int) oNum);

        System.out.println(oNum);

//      String number = oNum; compilation error - need an explicit cast
//      String number = (String) oNum; // ClassCastException.
        String number = "" + oNum; // now it works
        System.out.println( "string number: " + number);
    }
}
