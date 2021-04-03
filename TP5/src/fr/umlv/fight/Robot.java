package fr.umlv.fight;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/*
exo1:
question1: On ne peux pas utiliser un Record car si la vie du robot change, le champs ne peut pas être final
 */
public class Robot {
    private final String name;
    private int hp;

    public Robot(String name) {
        this.name = Objects.requireNonNull(name);
        this.hp = 10;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        if (isDead()) {
            throw new IllegalStateException("Arretez ce massacre !!!");
        }
        this.hp = hp;
    }

    @Override
    public String toString() {
        return "Robot " + name;
    }

    protected boolean rollDice() {
        return ThreadLocalRandom.current().nextInt(1, 7) == 1;
    }

    public void fire(Robot robot) {
        if (this.rollDice()) {
            robot.setHp(robot.hp - 2);
            System.out.println(robot + " a été touché par le " + this + " !");
        } else {
            System.out.println(this + " a raté le " + robot + " !");
        }
    }

    public boolean isDead() {
        return hp <= 0;
    }
}
