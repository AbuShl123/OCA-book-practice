package my.packet.exceptions_unit;

public class ClassCastingException2
{
    public static void main(String[] args) {
        Animal animal = new Animal("leopard");

        Bird bird = new Bird("eagle");

        // Bird newBird = (Bird) animal; // ClassCastException

        Animal newAnimal = bird; // works even without an explicit casting call

        Bird animalBird = (Bird) newAnimal; // not a problem as well

        Animal birdAnimal = new Bird("Owl");

        Animal anotherOwl = birdAnimal;

        Bird anotherBird = (Bird) birdAnimal; // situation identical to line 14.
    }
}

class Animal {
    public Animal(String name) {
        System.out.println(name);
    }
}

class Bird extends Animal {
    public Bird (String name) {
        super(name);
    }
}
