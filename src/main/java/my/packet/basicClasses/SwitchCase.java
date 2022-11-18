package my.packet.basicClasses;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        String firstName = new Scanner(System.in).next();
        String middleName = "Patricia";
        final String suffix = "FX";
        int id = 0;
        switch (firstName) {
            case "Abu":
                System.out.println("case 1");
                break;
//          case middleName:
//              System.out.println("case 2");
//              break;;
        }

        System.out.println("=======================");
        final char a = 'A', d= 'D';
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good"); break;
            case d:
            case 'F':
                System.out.print("not good");
        }
    }

    public int f(String firstName, final  String lastName) {
        String middleName = "Patricia";
        final String suffix = "FX";
        int id = 0;
        switch (firstName) {
            case "Abu":
                return 12;
//          case middleName: <-- DOES NOT COMPILE
//              return 34; break;
            case suffix:
                return 10;
//          case lastName:  <-- DOES NOT COMPILE
//              return 32;
        }
        return 0;
    }
}

