package exo3;

public class Pixel {
    public final static int ORIGIN = 0;
    private int x;
    private int y;

    public Pixel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static String displayPixels(Pixel[] pixels) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(pixels.length).append(pixels.length > 1 ? " pixels: {\n" : " pixel: {\n");
        for (int i = 0; i < pixels.length; i++) {
            var pixel = pixels[i];
            stringBuilder.append("(").append(pixel.x).append(",").append(pixel.y).append(")");

            // Last iteration
            if (i != pixels.length - 1) {
                stringBuilder.append(" ;\n");
            }
        }
        return stringBuilder.append(" }").toString();
    }

    public static void resetAtOriginAllPixelsWithXAt(int targetX, Pixel[] pixels) {
        for (var pixel : pixels) {
            if (pixel.x == targetX) {
                pixel.reset();
            }
        }
    }

    public void reset() {
        x = ORIGIN;
        y = ORIGIN;
    }

    public void printOnScreen() {
        System.out.println("(" + x + "," + y + ")");
    }
}
