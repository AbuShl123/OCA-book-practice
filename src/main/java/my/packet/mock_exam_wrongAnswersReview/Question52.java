package my.packet.mock_exam_wrongAnswersReview;

public class Question52 {
    public static void main(String[] args) {
        // question: what does the following code result?
        int[] [] arr = new int[2][4];
        arr[0] = new int[]{1, 3, 5, 7};
        arr[1] =    new int[]{1, 3};
        for (int[] a : arr) {
            for (int i : a) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // the correct answer is: `1 3 5 7 \n1 3`
        /*
        my answer was: compilation error
        which is not correct.
        I was confused by the 5th line, where the size of inner arrays are set to 4 but in 7th line it has 2 elements
        as it turned out it's totally fine and doesn't cause any compilation errors.
         */
    }
}
