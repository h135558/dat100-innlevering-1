package no.hvl.dat100;

import static javax.swing.JOptionPane.*;

public class O2ExceptionHandling {

	public static void main(String[] args) {
		String input = null;

		for (int i = 1; i < 11; i++) {
			try {
				input = showInputDialog("Skriv inn poengsum #" + i + ":");
				int tall = Integer.parseInt(input);

				showMessageDialog(null, tall + " poeng gir karakteren: " + karakter(tall));
			}

			// Feilhåndtering for ugyldig input i parseInt()
			catch (NumberFormatException e) {
				if (input == null) {
					showMessageDialog(null, "Avslutter programmet");
					return;
				}

				else if (input.isEmpty())
					showMessageDialog(null, "Du må skrive inn noe");
				else
					showMessageDialog(null, "\"" + input + "\" er ikke ett heltall");
				i--;
			}

			// Feilhåndtering for utenfor gyldig intervall
			catch (IllegalArgumentException e) {
				showMessageDialog(null, e.getMessage());
				i--;
			}

			// Ukjent feil, avslutt program
			catch (Exception e) {
				showMessageDialog(null, e.getMessage() + "\nAvslutter programmet");
				return;
			}
		}
	}

	public static String karakter(int p) {
		// Sjekk om input er innenfor gyldig intervall
		if (p < 0 || p > 100)
			throw new IllegalArgumentException(p + " er ikke i intervallet [0, 100]");
		// Eliminerer karakterer i stigende rekkefølge
		// @formatter:off
		return p <= 39 ? "F" :
			   p <= 49 ? "E" :
			   p <= 59 ? "D" :
			   p <= 79 ? "C" :
			   p <= 89 ? "B" :
			   "A";
		// @formatter:on
	}
}