package aclass;

public class PrimitiveObjectTypes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Person a;
		Person b;
		a = new Person("Everett");
		b = a;
		a.changeName("Delmar");
		System.out.println("b name " + b.getName());

	}

	public static void primitive() {
		int a;
		int b;
		a = 32;
		b = a;
		a = a + 1;
		System.out.println("b: " + b);

	}

}
