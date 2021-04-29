package fr.umlv.fight;

public class Arena {
    public static Robot fight(Robot first, Robot second) {
        while (true) {
            if(first.fire(second)){
                return first;
            }

            if(second.fire(first)){
                return second;
            }
        }
    }
}
