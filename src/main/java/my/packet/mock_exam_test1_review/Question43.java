package my.packet.mock_exam_test1_review;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Question43 {
    public static boolean checkList(List<Integer> list, Predicate<List<Integer>> p){
        return p.test(list);
    }
    public static void main(String[] args) {
        boolean b = checkList(new ArrayList<>(), (List<Integer> a1) -> a1.add(0));
//      boolean b = checkList(new ArrayList(), (ArrayList<Integer> a1) -> a1.isEmpty()); // this version is wrong.
//      seems like lambda doesn't care about covariant types.

        System.out.println(b);
    }
}
