package exo4;

// Cette ligne importe le type Scanner pr�sent dans le package java.util
// Cela nous permet d'utiliser un Scanner dans cette classe
import java.util.Scanner;

public class Calc {

	public static void main(String[] args) {
		// Variable scanner de type Scanner
		Scanner scanner = new Scanner(System.in);

		// Variable value de type primitif int
		// nextInt n'est pas une fonction car elle est appel� depuis un objet. Il s'agit
		// d'une m�thode
		int firstValue = scanner.nextInt();
		int secondValue = scanner.nextInt();

		// System.out.println("Voici votre valeur: " + firstValue);

		System.out.println("Somme: " + firstValue + " + " + secondValue + " = " + (firstValue + secondValue));
		System.out.println("Diff�rence: " + firstValue + " - " + secondValue + " = " + (firstValue - secondValue));
		System.out.println("Produit: " + firstValue + " * " + secondValue + " = " + (firstValue * secondValue));
		System.out.println("Quotient: " + firstValue + " / " + secondValue + " = " + (firstValue / secondValue));
		System.out.println("Reste: " + firstValue + " % " + secondValue + " = " + (firstValue % secondValue));

		scanner.close();
	}
}
