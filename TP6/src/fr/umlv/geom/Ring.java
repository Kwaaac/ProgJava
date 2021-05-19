package fr.umlv.geom;

import java.util.Objects;

public class Ring extends Circle {
    private final int internRadius;

    public Ring(Point center, int radius, int internRadius) {
        super(Objects.requireNonNull(center), radius);
        if (internRadius >= radius) {
            throw new IllegalArgumentException("Internal radius");
        }

        this.internRadius = internRadius;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", InternalRadius=" + internRadius;
    }

    @Override
    public double surface() {
        return super.surface() - Math.PI * Math.pow(internRadius, 2);
    }

    @Override
    public boolean contains(Point point) {
        return super.contains(point) && distanceFromCenter(point) > Math.pow(internRadius, 2);
    }
}
