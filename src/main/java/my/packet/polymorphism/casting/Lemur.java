package my.packet.polymorphism.casting;

import my.packet.polymorphism.Reptile;

public class Lemur extends Primate implements HasTail{
    @Override
    public boolean isTailStriped() {
        return false;
    }

    public int age;

    public static void main(String[] args) {
        Lemur lemur = new Lemur();
        System.out.println(lemur.age);

        HasTail hasTail = new Lemur();
        System.out.println(hasTail.isTailStriped());

        Primate primate = new Lemur();
        System.out.println(primate.hasHair());



    }
}
