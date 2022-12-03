package my.packet.object_casting_issues;

import my.packet.object_casting_issues.classes.Animal;
import my.packet.object_casting_issues.classes.Fish;
import my.packet.object_casting_issues.classes.Rabbit;

public class CasingClasses {
    public static void main(String[] args) {
        Fish fish = new Fish();

        Rabbit rabbit = new Rabbit();

        Animal animal_fish = fish;

        Animal animal_rabbit = rabbit;

//      fish = animal_fish; // need an explicit cast
        fish = (Fish) animal_fish;
        System.out.println("fish = (Fish) animal_fish; works fine");

        rabbit = (Rabbit) animal_rabbit;
        System.out.println("rabbit = (Rabbit) animal_rabbit; works fine");

        try {
            fish = (Fish) animal_rabbit; // ClassCastException
        } catch (ClassCastException e) {
            System.out.println("26: fish = (Fish) animal_rabbit; // gives ClassCastException");
        }

        try {
            Animal animal = new Animal("animal");
//          Fish newFish = animal; // need an explicit cast
            Fish newFish = (Fish) animal;
        } catch (ClassCastException e) {
            System.out.println("34: Fish newFish = (Fish) animal; // gives ClassCastException");
        }
    }
}
