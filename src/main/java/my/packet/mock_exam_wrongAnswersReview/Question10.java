package my.packet.mock_exam_wrongAnswersReview;

import java.util.Random;

public class Question10 {
    public static void main(String[] args) {
        CheckingAmount acct = new CheckingAmount((int) (Math.random() * 1000));
        // what to add in line 9 to make code print 0? (choose three)
        // option 1:
        acct.amount = 0; // pretty obvious (it works)
        // option 2:
        acct.changeAmount(0); // it doesn't work (think why)
        // option 3:
        acct.changeAmount(-acct.getAmount()); // this one looks suspicious but actually works
        // option 4:
        acct.changeAmount(-acct.amount); // same as 14. Also works
        // there were other options in exam as well, but they were straightforward.
        System.out.println(acct.amount);
    }
}

class CheckingAmount {
    public int amount;

    public CheckingAmount(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public void changeAmount(int x) {
        amount += x;
    }
}