package fr.umlv.fight.main;

import fr.umlv.fight.Arena;
import fr.umlv.fight.Robot;

public class Main {
    public static void main(String[] args) {
        var bob = new Robot("bob");
        var alice = new Robot("alice");
        System.out.println(bob);// affiche "Robot bob"

        System.out.println("Le vainqueur est: " + Arena.fight(bob, alice));
    }
}
