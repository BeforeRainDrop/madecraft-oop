package exercises;

public class Smurf {

	public static Smurf createSmurf(String name) {
		System.out.println("Creating " + name + " Smurf");
		return new Smurf(name);
	}

	private String name;

	private Smurf(String name) {
		this.name = name;
	}

	public void eat() {
		System.out.println(name + " Smurf is eating Smurfberries.");
	}

	public void printName() {
		System.out.println("My name is " + name + " Smurf.");
	}

}
