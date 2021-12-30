package exercises;

public class Minion {

	private String name;
	private int eyes;
	private String color;
	private String master;

	public Minion(String name, int eyes, String color, String master) {
		super();
		this.name = name;
		this.eyes = eyes;
		this.color = color;
		this.master = master;
	}

	public String getColor() {
		return color;
	}

	public int getEyes() {
		return eyes;
	}

	public String getMaster() {
		return master;
	}

	public String getName() {
		return name;
	}

	public void setMaster(String master) {
		this.master = master;

	}

}
