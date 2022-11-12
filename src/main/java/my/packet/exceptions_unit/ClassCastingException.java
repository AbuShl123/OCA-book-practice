package my.packet.exceptions_unit;

public class ClassCastingException {
    public static void main(String[] args) {
        String b = "type";
//        Integer num = (Integer) b; compile time

        Object o = b;
        //Integer number = (Integer) o; classCastException

        Object oNum = 12;
        Integer noProb = (Integer) oNum;
        System.out.println(noProb);
    }
}
