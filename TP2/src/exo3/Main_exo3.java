package exo3;

public class Main_exo3 {

    /**
     * Le modificateur doit être static pour être utiliser dans le main
     */
    private static void q1() {
        var empty = new Pixel[]{};
        var singlePixel = new Pixel[]{new Pixel(1, 1)};
        var fivePixels = new Pixel[]{new Pixel(1, 1), new Pixel(2, 2), new Pixel(3, 3), new Pixel(4, 4), new Pixel(5, 5)};

        System.out.println(Pixel.displayPixels(empty));
        System.out.println(Pixel.displayPixels(singlePixel));
        System.out.println(Pixel.displayPixels(fivePixels));

        System.out.println();
    }

    private static void q2() {
        var empty = new Point[]{};
        var singlePoints = new Point[]{new Point(1, 1)};
        var fivePoints = new Point[]{new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4), new Point(5, 5)};
        System.out.println(Point.displayPoints(empty));
        System.out.println(Point.displayPoints(singlePoints));
        System.out.println(Point.displayPoints(fivePoints));
    }

    private static void q3() {
        var fivePixels = new Pixel[]{new Pixel(1, 1), new Pixel(2, 2), new Pixel(3, 3), new Pixel(4, 4), new Pixel(5, 5)};
        Pixel.resetAtOriginAllPixelsWithXAt(3, fivePixels);
        System.out.println(Pixel.displayPixels(fivePixels));
    }

    /**
     * Le problème c'est que nos points sont des Record et sont donc immuable.
     * Dans notre cas, exceptionnellement, la destruction qui va ammener la création pour une modification.
     * On recréer un nouvel object Point que l'on init à (0, 0) et on le remplace par le point de la targetX
     */
    private static void q4() {
        var fivePoints = new Point[]{new Point(1, 1), new Point(2, 2), new Point(3, 3), new Point(4, 4), new Point(5, 5)};
        Point.resetAtOriginAllPointsWithXAt(3, fivePoints);
        System.out.println(Point.displayPoints(fivePoints));
    }

    public static void main(String[] args) {
        // q1();
        // q2();
        // q3();
        // q4();
    }
}
