package my.packet.equal_strings;

public class String_And_Builder_Equals {
    public static void main(String[] args) {
        /*  -- From OCA:
        Calling == on String objects will check whether they point to the same object in the
        pool. Calling == on StringBuilder references will check whether they are pointing to the
        same StringBuilder object. Calling equals() on String objects will check whether the
        sequence of characters is the same. Calling equals() on StringBuilder objects will check
        whether they are pointing to the same object rather than looking at the values inside.
         */

        System.out.println("comparing only between Strings");
        String word = "apple";
        System.out.println(word == "apple");
        String another = "apple";
        System.out.println(word == another);

        StringBuilder sb = new StringBuilder("apple");
//      System.out.println(word == sb); this will not compile because string and StringBuilder are of different types

//      System.out.println(sb == "apple"); doesn't compile because of the same reasons as in line 19

        System.out.println("comparing Strings and StringBuilders");
        System.out.println(sb.equals(word)); // but this way it works
        System.out.println(sb.equals("apple"));

        System.out.println(another.equals(sb)); // since they are different types it returns false (although contents are same)


        System.out.println("comparing only between StringBuilders");
        StringBuilder builder = new StringBuilder("apple");
        System.out.println(builder == sb);
        System.out.println(builder.equals(sb));

        StringBuilder sb_pointer = sb;

        System.out.println(sb == sb_pointer);
        System.out.println(sb.equals(sb_pointer));
    }
}
