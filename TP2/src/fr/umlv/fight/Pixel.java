package fr.umlv.fight;

public class Pixel {
    public final static int ORIGIN = 0;
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void reset() {
        x = ORIGIN;
        y = ORIGIN;
    }

    public void printOnScreen() {
        System.out.println("(" + x + "," + y + ")");
    }
}


