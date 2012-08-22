package agame.wuerfel;

public class Wuerfel {
	// Felder
	private int oberSeite;

	// Constructors
	public Wuerfel() {
		oberSeite = 1;
	}

	// Methods
	// getter / accessor method
	public int augen() {
		return oberSeite;
	}

	public void werfe() {
		oberSeite = (int) (Math.random() * 6) + 1;

	}
}