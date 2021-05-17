package fr.umlv.geom;

import java.util.Arrays;
import java.util.Objects;

public class Circle {
    private final int radius;
    private final Point center;

    public Circle(Point center, int radius) {
        Objects.requireNonNull(center);
        if (radius < 0) {
            throw new IllegalArgumentException("Negative radius");
        }
        this.radius = radius;
        this.center = new Point(center);
    }

    public Point center() {
        return new Point(center);
    }

    public double surface() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "radius=" + radius +
                ", center=" + center +
                ", surface= " + surface();
    }

    public void translate(int dx, int dy) {
        center.translate(dx, dy);
    }

    /**
     * Return the squared distance from the center to the given point
     *
     * @param point given point
     * @return Return the squared distance from the center to the given point
     */
    int distanceFromCenter(Point point) {
        return (point.getX() - center.getX() * point.getX() - center.getX()) +
                (point.getY() - center.getY() * point.getY() - center.getY());
    }

    public boolean contains(Point point) {
        return distanceFromCenter(point) <= Math.pow(radius, 2);
    }

    public static boolean contains(Point point, Circle... circles) {
        return Arrays.stream(circles).anyMatch(circle -> circle.contains(point));
    }
}
