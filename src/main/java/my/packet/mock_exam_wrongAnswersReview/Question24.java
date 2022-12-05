package my.packet.mock_exam_wrongAnswersReview;

public class Question24 {
    public static void main(String[] args) {
        Base b1 = new DerivedB();
        Base b2 = new DerivedA();
        Base b3 = new DerivedB();

        b1 = (Base) b3;
        Base b4 = (DerivedA) b3;
        b1.test();
        b4.test();
        // actually this question I got right -- ClassCastException is thrown at runtime.
        // but maybe exam writers misspelled. Maybe they meant `Base b4 = (DerivedB) b3;` at line 10.
    }
}

class Base {
    public void test() {
        System.out.println("base");
    }
}

class DerivedA extends Base {
    @Override
    public void test() {
        System.out.println("DerivedA");
    }
}

class DerivedB extends Base {
    @Override
    public void test() {
        System.out.println("DerivedB");
    }
}
