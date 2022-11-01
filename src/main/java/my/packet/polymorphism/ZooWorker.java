package my.packet.polymorphism;

public class ZooWorker {
    public static void feed (   Reptile reptile) {
        System.out.println("Feeding reptile: " + reptile.getName());
    }

    public static void main(String[] args) {
        feed(new Crocodile());
        feed(new Alligator());
        feed(new Reptile());
    }
}
