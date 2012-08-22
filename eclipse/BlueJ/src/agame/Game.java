package agame;

import agame.wuerfel.Wuerfel;

public class Game {

	public static void main(String[] argumente) {

		while (true) {
			System.out.println("Hallo Welt!");

			Wuerfel wuerfel1 = new Wuerfel();
			Wuerfel wuerfel2 = new Wuerfel();

			wuerfel1.werfe();
			wuerfel2.werfe();

			System.out.println("Die WŸrfel: " + wuerfel1.augen() + " | "
					+ wuerfel2.augen());
		}
	}

}

// int inChar = System.in.read();
