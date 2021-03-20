package exo3;

public class PrintArgs {
	
	private static void firstArg(String[] args) {
		System.out.println(args[0]);
	}
	
	private static void forArgs(String[] args) {
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("\n");
	}
	
	private static void forEachArgs(String[] args) {
		for(String arg: args) {
			System.out.println(arg);
		}
	}

	public static void main(String[] args) {
		System.out.println("Question 1:");
		firstArg(args);
		System.out.println("Lorsqu'il n'y a pas d'arguments, l'erreur ArrayIndexOutOfBoundsException est relevée\n\n");
		
		System.out.println("Question 2:");
		forArgs(args);
	
		
		System.out.println("Question 3:");
		forEachArgs(args);
		
	}

}
