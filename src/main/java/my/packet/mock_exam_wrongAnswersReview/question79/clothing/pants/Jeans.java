package my.packet.mock_exam_wrongAnswersReview.question79.clothing.pants;

import static my.packet.mock_exam_wrongAnswersReview.question79.clothing.Shirt.getColor; // line n1
public class Jeans {
    public void matchShirt() {
        String color = getColor(); // line n2
        if (color.equals("Green")) {
            System.out.println("Fit");
        }
    }

    public static void main(String[] args) {
        Jeans trouser = new Jeans();
        trouser.matchShirt();
    }
}

/*
    the question was "which of two actions, independently, enable the code fragment to print Fit?"
    this was simple task.
    at line n1 I inserted import clothing.*;
    and at line n2 I inserted String color = Shirt.getColor();
    which is completely fine. I don't know why my answer is wrong.
 */
