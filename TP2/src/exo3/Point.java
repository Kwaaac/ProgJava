package exo3;

public record Point(int x, int y) {

    public static String displayPoints(Point[] points) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(points.length).append(points.length > 1 ? " points: {\n" : " point: {\n");
        for (int i = 0; i < points.length; i++) {
            var point = points[i];
            stringBuilder.append("(").append(point.x()).append(",").append(point.y()).append(")");

            // Last iteration
            if (i != points.length - 1) {
                stringBuilder.append(" ;\n");
            }
        }
        return stringBuilder.append(" }").toString();
    }

    public static void resetAtOriginAllPointsWithXAt(int targetX, Point[] points) {
        for (int i = 0; i < points.length; i++) {
            if (points[i].x() == targetX) {
                points[i] = new Point(0, 0);
            }
        }
    }
}
