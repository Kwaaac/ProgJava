package fr.umlv.geom;

import java.util.Arrays;
import java.util.Objects;

public record RecordCircle(Point center, int radius) {
    public RecordCircle(Point center, int radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius");
        }
        this.center = new Point(Objects.requireNonNull(center));
        this.radius = radius;
    }

    public Point center() {
        return new Point(center);
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", center=" + center +
                ", surface= " + surface();
    }

    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    public boolean contains(Point point) {
        return Math.pow(point.getX() - center.getX(), 2) + Math.pow(point.getY() - center.getY(), 2) <= Math.pow(radius, 2);
    }

    public static boolean contains(Point point, Circle... circles) {
        return Arrays.stream(circles).anyMatch(circle -> circle.contains(point));
    }
}
