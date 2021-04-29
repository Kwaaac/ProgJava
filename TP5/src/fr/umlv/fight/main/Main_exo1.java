package fr.umlv.fight.main;

import fr.umlv.fight.Arena;
import fr.umlv.fight.Fighter;
import fr.umlv.fight.Robot;

public class Main_exo1 {
    public static void main(String[] args) {
        var arthur = new Fighter("Arthur Dent", 42);
        var marvin = new Robot("Marvin");

        System.out.println(arthur); // affiche "Robot bob"

        System.out.println("Le vainqueur est: " + Arena.fight(arthur, marvin));


        var john = new Fighter("John", 1);
        var jane = new Fighter("Jane", 2);
        System.out.println(Arena.fight(john, jane) + " wins");
    }
}
