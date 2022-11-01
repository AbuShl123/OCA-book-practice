package my.packet.polymorphism.casting.castringProblem;

public class Capybara extends Rodent{
    public static void main(String[] args) {
        Rodent rodent = new Rodent();

//        Capybara capybara = rodent; // casting to smaller type -> does not compile.

        Capybara capybara;
        // capybara = (Capybara) rodent;  ClassCastException!

        if (rodent instanceof Capybara) { // false
            capybara = (Capybara) rodent;
        }


        Capybara capybara1 = new Capybara();
        rodent = capybara1;
        capybara1 = (Capybara) rodent; // but this one will not produce any issues.

    }
}
