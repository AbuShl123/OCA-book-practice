package my.packet.polymorphism.casting;

public class CastingObjects {
    public static void main(String[] args) {
        Lemur lemur1 = new Lemur();

        Primate primate = lemur1; // casting from child to parent type

        Lemur lemur2 = new Lemur();

//        lemur2 = primate; it gives an error, because casting to smaller type

        lemur2 = (Lemur) primate; // explicit casting
        System.out.println(lemur2.age);

    }
}
