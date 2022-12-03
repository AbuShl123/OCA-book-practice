package my.packet.castingPrimitives;

import java.util.Scanner;

public class Practice01 {
    public static void main(String[] args) {
        System.out.println("Project started");
        int i =0;
        while (i++ < 3) {
            int a = new Scanner(System.in).nextInt();
            byte b = (byte) a;
            System.out.println("byte = " + b);
        }

        float d = .6f;
        System.out.println(d);
    }
}
