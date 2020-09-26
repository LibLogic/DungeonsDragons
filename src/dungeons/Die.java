package dungeons;

public class Die {
	int value;
	public int roll() {
		value = (int)Math.floor((Math.random() * 20) + 1);
		System.out.println("d20 Roll :\t\t" + value + "\n");
		if(value == 20) {return -1;}
		if(value == 1) {return 0;}
		return value;		
	}
	
	public int roll(String dieConfiguration) {
		value = 0;
		int delimeter = dieConfiguration.indexOf("d");
		int numOfRolls = 1;
		String temp = dieConfiguration.substring(0, delimeter);
		if(!temp.equals("")) {numOfRolls = Integer.parseInt(dieConfiguration.substring(0, delimeter));} 
		int numOfSides = Integer.parseInt(dieConfiguration.substring(delimeter + 1));	
		for (int i = 1; i <= numOfRolls; i++) {
			int roll = (int)Math.floor((Math.random() * numOfSides) + 1);
			value += roll;
			System.out.println("Damage Roll " + i +":\t\t" + roll);
		}
		return value;		
	}
}