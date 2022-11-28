package my.packet.arrays;

import java.util.Arrays;

public class ArrayGames {
    public static void main(String[] args) {
//      int[][] arr = new int[][]; compiler error -- we cannot do like that
        int[][] arr = new int[0][]; // but this way we can

        System.out.println(Arrays.deepToString(arr)); // interesting, isn't it?

//        arr[0] = new int[] {1,2,3}; // index out of bounds

//        int[][] nums = new int[][3]; // doesn't work
        int[][] nums = new int[0][3]; // works even though it has not sense
        System.out.println(Arrays.deepToString(nums));
    }
}
