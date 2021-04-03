package fr.umlv.fight;

public class Arena {
    public static Robot fight(Robot first, Robot second) {
        while (true) {
            if (first.isDead()) {
                return second;
            }
            first.fire(second);

            if (second.isDead()) {
                return first;
            }
            second.fire(first);
        }
    }
}
