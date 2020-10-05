package simulator;

public class Die {
	private int value;
	private int numSides = 6;
	private String color = "White";
	
	public Die() {
		value = (int)Math.floor((Math.random() * this.numSides) + 1);
	}
	
	public Die(int numSides) {
		this.numSides = numSides;
		value = (int)Math.floor((Math.random() * this.numSides) + 1);
	}

	public int roll() {
		value = (int)Math.floor((Math.random() * this.numSides) + 1);
		return this.value;
	}

	public int roll(String dieConfiguration) {
		return 0;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "" + value;
	}
}
