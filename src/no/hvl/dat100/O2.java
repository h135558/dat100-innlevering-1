package no.hvl.dat100;

public class O2 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		for (int i = 1; i < 11; i++) {
			System.out.print("Skriv inn poengsum #" + i + ": ");
			int tall = Integer.parseInt(scanner.next());
			char karakter = karakter(tall);

			if (karakter == 'X') {
				System.out.println(tall + " er ikke i intervallet [0, 100]");
				i--;
			}

			else
				System.out.println(tall + " poeng gir karakteren: " + karakter);
		}

		scanner.close();
	}

	public static char karakter(int p) {
		// @formatter:off
		return p < 0 ? 'X':
			   p <= 39 ? 'F' :
			   p <= 49 ? 'E' :
			   p <= 59 ? 'D' :
			   p <= 79 ? 'C' :
			   p <= 89 ? 'B' :
			   p <= 100 ? 'A':
			   'X';
		// @formatter:on
	}
}