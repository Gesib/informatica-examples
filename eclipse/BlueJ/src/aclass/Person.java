package aclass;

public class Person {

	private String name;
	public Person(String newName) {
		name = newName;
	}

	public void changeName(String newName) {
		name = newName;
		
	}

	public String getName() {
		return name;
	}

}
