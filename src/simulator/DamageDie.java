package simulator;

public class DamageDie extends Die {
	
	private int value;
	
	@Override
	public int roll(String dieConfiguration) {
		value = 0;
		int numOfRolls = 1;
		String[] temp = dieConfiguration.split("d");
		if(!temp[0].equals("")) {numOfRolls = Integer.parseInt(temp[0]);} 
		int numOfSides = Integer.parseInt(temp[1]);	
		for (int i = 1; i <= numOfRolls; i++) {
			int roll = (int)Math.floor((Math.random() * numOfSides) + 1);
			this.value += roll;
			System.out.println("Damage Roll " + i +":\t\t" + roll);
		}
		return this.value;		
	}
}
