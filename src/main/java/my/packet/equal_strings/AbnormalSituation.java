package my.packet.equal_strings;

public class AbnormalSituation {
    public static void main(String[] args) {
        // that's a crazy example honestly
        String word1 = "str1";
        String word2 = "str2";

        // first boolean
        boolean condition = word1.equals(word1=word2);
        System.out.println("condition = " + condition);

        // result after first bool
        System.out.println(word1 + " : " + word2);

        // second boolean
        boolean again = word1.equals(word1=word2);
        System.out.println("again = " + again);

        // result after second bool
        System.out.println(word1 + " : " + word2);
    }
}
