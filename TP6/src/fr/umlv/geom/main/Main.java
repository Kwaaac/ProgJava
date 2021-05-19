package fr.umlv.geom.main;

import fr.umlv.geom.Circle;

public class Main {
    public static void main(String[] args) {
        /*
        var point = new Point(1, 2);
        var circle = new Circle(point, 1);

        var circle2 = new Circle(point, 2);
        circle2.translate(1, 1);

        System.out.println(circle + " \n" + circle2);
        */

        /*
        var p = new Point(1, 2);
        var c = new Circle(p, 1);
        var p2 = c.center();
        p2.translate(1,1);
        System.out.println(c);
         */
        /*
        var point = new Point(1, 1);
        var circle = new Circle(point, 2);
        System.out.println(circle);
        var ring = new Ring(point, 2, 1);
        System.out.println(ring);

        var ring2 = new Ring(point, 2, 1);
        var ring3 = new Ring(point, 2, 1);

        System.out.println(Circle.contains(point, ring, ring2, ring3));
         */

        /*
        var p = new Point(1, 1);
        var c1 = new Circle(new Point(6, 6), 2);
        var c2 = new Circle(new Point(5, 5), 1);
        var c3 = new Circle(new Point(0, 0), 2);
        */

        /*
        var p = new Point(0, 0);
        var c1 = new Ring(new Point(6, 6), 2, 1);
        var c2 = new Ring(new Point(5, 5), 3, 1);
        var c3 = new Ring(new Point(0, 0), 3, 1);

        System.out.println(Circle.contains(p, c1, c2, c3));
        */
    }
}
