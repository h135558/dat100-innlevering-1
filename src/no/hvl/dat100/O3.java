package no.hvl.dat100;

public class O3 {

	public static void main(String[] args) {
		int n;
		long fakultet;
		java.util.Scanner input = new java.util.Scanner(System.in);

		do {
			System.out.print("Beregn fakultet til: ");
			n = input.nextInt();
			fakultet = fakultet(n);

			if (fakultet < 1)
				System.out.println("Kan ikke beregne fakultet til negative tall");
		} while (fakultet < 1);

		input.close();
		System.out.println(n + "! = " + fakultet);
	}

	public static long fakultet(int n) {
		int fakultet = 1;

		if (n < 0)
			return 0;

		for (long i = 2; i <= n; i++) {
			fakultet *= i;
		}

		return fakultet;
	}
}
