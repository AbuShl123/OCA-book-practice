package my.packet.arrays;

public class Null_In_Array {
    public void initData(String[] arr){
        int ind = 0;
        for(String str : arr){
            str.concat(str+" "+ind); // <-- may throw NullPointerException in case if arr contains null references
            ind++;
        }
    }

    public void printData(String[] arr){
        for(String str : arr){
            System.out.println(str);
        }
    }

    public static void main(String[] args) {
        Null_In_Array ot = new Null_In_Array();
        String[] arr = new String[2]; // arr has two String elements which are not assigned --> they are all null
        ot.initData(arr); // be careful when calling method which use elements of array
        ot.printData(arr);
    }
}
