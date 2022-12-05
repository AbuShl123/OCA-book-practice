package my.packet.mock_exam_wrongAnswersReview;

import java.io.IOException;

public class Question40 {
    /*
    Given three java files (below). We need to determine which of them compile successfully.
     */
}

// A.java
class A {
    public void a() {
        int a;
    }
}

// B.java
class B {
    public int doStuff() {
      // private int k = 0; // local variables cannot be private.
      // return k++;
        return 0; // this line wasn't on exam
    }
}

// C.java
// import java.io.*;
// package pi;
class AA {
    public void main(String fileName) throws IOException {
    } // looks like there are no mistakes right?
}

/*
the correct answer is: "Only A.java file compiles successfully."
my answer was: "Only A.java and C.java files compile successfully."
which was incorrect.
why?
because I didn't notice that import statement in this file goes before package statement.
this makes a compilation error
 */