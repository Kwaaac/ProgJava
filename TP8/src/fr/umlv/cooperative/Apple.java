package fr.umlv.cooperative;

import java.util.Objects;

public record Apple(int weight, AppleKind variety) implements Fruit {

    public Apple {
        Objects.requireNonNull(variety);
        if (weight < 0) {
            throw new IllegalArgumentException("The weight must be positive");
        }
    }

    @Override
    public String toString() {
        return variety + " " + weight + " g ";
    }

    @Override
    public int price() {
        return weight / 2;
    }
}
