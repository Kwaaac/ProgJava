package exo6;

public class Pascal {

	public static int getPascal(int nBut, int pBut) {
		int tab[] = new int[nBut + 1];

		tab[0] = 1;

		for (int n = 1; n <= nBut; n++) {
			tab[n] = 1;

			for (int i = n - 1; i > 0; i--)
				tab[i] = tab[i - 1] + tab[i];
		}

		return tab[pBut];
	}

	public static void main(String[] args) {
		System.out.println("Cn, p = " + getPascal(30_000, 250));
	}

}
