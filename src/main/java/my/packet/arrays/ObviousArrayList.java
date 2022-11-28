package my.packet.arrays;

import java.util.ArrayList;
import java.util.List;

public class ObviousArrayList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//      list.capacity(); arrayList doesn't have capacity() method

//        list.remove(0); // will throw an exception (but compiles!)

        list.add(Integer.parseInt("5"));
        list.add(7);
        list.add(Integer.valueOf("3"));
        list.add((Integer) 4);
        list.add(null);

        for (int v : list){ // will result with exception (but if to replace v to Integer type will run successfully)
            System.out.println(v);
        }
    }
}
