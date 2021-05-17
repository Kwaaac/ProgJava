package fr.umlv.cooperative;

public record Apple(int weight, AppleKind variety) implements Fruit {
    @Override
    public String toString() {
        return variety + " " + weight + " g ";
    }

    @Override
    public int price() {
        return weight / 2;
    }
}
