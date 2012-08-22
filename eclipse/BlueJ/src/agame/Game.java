package agame;

public class Game {

	public static void main(String[] argumente) {
		System.out.println("Hallo Welt!");
		System.out.println("Hallo Welt! hat " + "Hallo Welt!".length()
				+ " Buchstaben");
		Wuerfel w1;
		Wuerfel w2;
		
		
		int wuerfel1_augen = werfeWuerfel();
		int wuerfel2_augen = werfeWuerfel();

		System.out.println("Die WŸrfel: " + wuerfel1_augen + " | "
				+ wuerfel2_augen);
	}

	public static int werfeWuerfel() {
		return (int) (Math.random() * 6) + 1;

	}
}
