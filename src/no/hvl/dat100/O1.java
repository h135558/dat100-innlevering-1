package no.hvl.dat100;

public class O1 {
	private final static int[] TRINN = { 208050, 292850, 670000, 937900, 1350000 };
	private final static double[] SATS = { 0.017, 0.04, 0.136, 0.166, 0.176 };

	public static void main(String[] args) {
		System.out.print("Skriv inn inntekten som du vil beregne trinnskatt på: ");

		java.util.Scanner input = new java.util.Scanner(System.in);
		int inntekt = input.nextInt();
		input.close();

		// Jeg vet ikke om trinnskatten rundes av eller trunkeres, eller ingen
		// av delene
		// Jeg har valgt å runde av
		System.out.println("Trinnskatten din blir: " + Math.round(trinnskatt(inntekt)) + " kroner");
	}

	// Dersom trunkering, ville datatypen til metoden her vært int
	public static double trinnskatt(int inntekt) {
		double trinnskatt = 0; // Trinnskatten er i utgangspunktet 0.

		// Løkka summerer skatt for de trinna det gjelder
		for (int i = TRINN.length - 1; i >= 0; i--) {
			if (inntekt > TRINN[i]) {
				trinnskatt += (inntekt - TRINN[i]) * SATS[i];
				inntekt = TRINN[i];
			}
		}

		return trinnskatt;
	}
}