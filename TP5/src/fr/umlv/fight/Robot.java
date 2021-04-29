package fr.umlv.fight;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/*
exo1:
question1: On ne peux pas utiliser un Record car si la vie du robot change, le champs ne peut pas être final
La classe est mutable
 */
public class Robot {
    private final String name;
    private int hp = 10;

    public Robot(String name) {
        this.name = Objects.requireNonNull(name);
    }

    private void setHp(int hp) {
        if (isDead()) {
            throw new IllegalStateException("Arretez ce massacre !!!");
        }

        this.hp = Math.max(hp, 0);
    }

    String displayType() {
        return "Robot ";
    }

    @Override
    public String toString() {
        return displayType() + name;
    }

    /**
     * Je met la visibilité de la méthode à default.
     * Je ne peux pas la mettre en public car la méthode n'est pas nécéssaire en dehors de la classe
     * Je ne peux pas la garder en private sinon Fighter ne pourrait pas y acceder
     * Je ne peux que la mettre à default ou protected.
     * La différence c'est que protected permettrai à fighter d'y acceder si il était dans un autre package
     * Ici les sous-classes de Robot sont dans le même package, je peux mettre à default
     * En revanche si ils étaient dans des packages différents, j'aurais mit protected.
     */
    boolean rollDice() {
        return true;
    }

    /**
     * The first robot shoot the given robot, if the second robot dies, the method return true, false if it survives.
     *
     * @param robot The given robot
     * @return true if robot dies, false otherwise
     */
    public boolean fire(Robot robot) {
        if (this.rollDice()) {
            robot.setHp(robot.hp - 2);
            System.out.println(robot + " a été touché par le " + this + " !");
        } else {
            System.out.println(this + " a raté le " + robot + " !");
        }

        return robot.isDead();
    }

    public boolean isDead() {
        return hp == 0;
    }
}
