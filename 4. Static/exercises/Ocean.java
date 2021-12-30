package exercises;

/*
 * 1. Create a class called Ocean.
 * 2. There make a SeaCreature called "Spongebob".
 * 3. Use the methods below to make him eat, and laugh.
 * 4. Make Patrick and Squidward and print their name, and make them laugh.
 */

public class Ocean {

	public static void main(String[] args) {
		SeaCreature spongeBob = new SeaCreature("Spongebob");
		spongeBob.eat();
		spongeBob.laugh();

		SeaCreature patrick = new SeaCreature("Patrick");
		SeaCreature squidward = new SeaCreature("Squidward");
		System.out.println(patrick.getName());
		patrick.laugh();
		System.out.println(squidward.getName());
		squidward.laugh();

	}

}
