package exo5;

// Pour compiler ce fichier en ligne de commande, il faut utiliser la commande:
// javac Point.java --enable-preview -source 15
public record Point(int x, int y) {

	/**
	 * Compute the gap between the origin and the point
	 * 
	 * @return The gap between the origin and the point
	 */
	public double distance() {
		return Math.sqrt(x*x + y*y);
	}

	public static void main(String[] args) {

		// "static" veut dire que la méthode est associé à la classe et non à une
		// instance de la classe
		Point point = new Point(Integer.parseInt(args[0]), Integer.parseInt(args[1]));

		// si l'argument n'est pas un nombre, l'erreur java.lang.NumberFormatException
		// est relevée

		System.out.println("x=" + point.x());
		System.out.println("y=" + point.y());

		System.out.println(point);

		System.out.println(point.distance());

	}
}
