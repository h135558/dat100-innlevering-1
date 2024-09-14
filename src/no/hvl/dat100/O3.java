package no.hvl.dat100;

public class O3 {

	public static void main(String[] args) {
		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("Beregn fakultet til: ");

		long n = scanner.nextLong();
		scanner.close();

		System.out.println(n + "! = " + fakultet(n));
	}

	public static long fakultet(long n) {		
		if (n == 0)
			return 1;
		if (n > 0)
			for (long i = n - 1; i > 0; i--) {
				n *= i;
			}
		else 
			throw new IllegalArgumentException("Kan ikke beregne fakultet til negative tall");
		
		return n;
	}
}
