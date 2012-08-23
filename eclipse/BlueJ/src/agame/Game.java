package agame;

public class Game {

	public static void main(String[] argumente) {
		//int wieOftGewuerfelt = 0;
		int gesamtsumme = 0;
		Wuerfel hans;
		hans = new Wuerfel();
		Wuerfel wuerfel1 = hans;

		Wuerfel otto = new Wuerfel();
		Wuerfel wuerfel2 = otto;
		while (gesamtsumme <= 50) {
			hans.werfe();
			otto.werfe();
			//wieOftGewuerfelt++;

			System.out.println("Die WŸrfel: " + hans.augen() + " | "
					+ otto.augen());
			int summeAktuellerWurf = wuerfel1.augen() + wuerfel2.augen();
			System.out.println("Summe Wurf: "+summeAktuellerWurf);
			gesamtsumme = gesamtsumme + summeAktuellerWurf;
			
		}
		System.out.println("Gesamtsumme" +gesamtsumme);
		System.out.println("Wuerfel 1 wurde " + hans.getZaehler()
				+ " mal geworfen.");
		//System.out.println("es wurde " + wieOftGewuerfelt + " mal gewŸrfelt");

	}

}
