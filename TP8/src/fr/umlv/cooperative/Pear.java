package fr.umlv.cooperative;

public record Pear(int juiceFactor) implements Fruit {
    @Override
    public int price() {
        return juiceFactor * 3;
    }

    @Override
    public String toString() {
        return "Pear " + juiceFactor + "/9 ";
    }
}
