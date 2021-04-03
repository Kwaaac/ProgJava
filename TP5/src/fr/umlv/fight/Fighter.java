package fr.umlv.fight;

import java.util.Random;

public class Fighter extends Robot {
    private final long seed;

    public Fighter(String name, long seed) {
        super(name);
        this.seed = seed;
    }

    @Override
    public boolean rollDice() {
        var rdm = new Random();
        rdm.setSeed(seed);
        return rdm.nextInt(3) == 1;
    }

    @Override
    public void fire(Robot robot) {
        super.fire(robot);
    }

    @Override
    public String toString() {
        return "Fighter " + super.getName();
    }
}
