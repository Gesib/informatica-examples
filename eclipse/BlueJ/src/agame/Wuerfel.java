package agame;

public class Wuerfel {
	// Felder
	private int oberSeite;
	private int zaehler =0;

	// Constructors
	public Wuerfel() {
		oberSeite = 1;
		zaehler = 0;
	}

	// Methods
	// getter / accessor method
	public int augen() {
		return oberSeite;
	}

	public void werfe() {
		oberSeite = (int) (Math.random() * 6) + 1;
		zaehler++;
	}

	public int getZaehler() {
		return zaehler;
	}
}