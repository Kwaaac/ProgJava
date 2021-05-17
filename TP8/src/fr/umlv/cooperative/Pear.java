package fr.umlv.cooperative;

public record Pear(int juiceFactor) implements Fruit {

    public Pear {
        if(juiceFactor < 0 || juiceFactor > 9){
            throw new IllegalArgumentException("The juice factor must be between 0 and 9");
        }
    }

    @Override
    public int price() {
        return juiceFactor * 3;
    }

    @Override
    public String toString() {
        return "Pear " + juiceFactor + "/9 ";
    }
}
