package simulator;

public class Simulator {
	
	public int attack(int ac, int dMod, int aMod, String damageDice) {
		
		Die d20 = new Die(20);
		Die die = new DamageDie();
		int damage = 0;
		int enemyDefenseValue = ac + dMod;
		System.out.println("Enemy Defense Value:\t" + enemyDefenseValue);
		System.out.println("\nPlayer Attack Modifier:\t" + aMod);
		int d20Roll = d20.roll();
		System.out.println("d20 Roll :\t\t" + d20Roll + "\n");


		if(d20Roll == 20) {
			int damage1 = die.roll(damageDice);
			System.out.println("Total:\t\t\t" + damage1 + "\n");
			int damage2 = die.roll(damageDice);
			System.out.println("Total:\t\t\t" + damage2);
			System.out.println("\nCritical Hit!\t" + damage1 + " + "
					+ damage2 + "\nDamage = " + (damage1 + damage2));
			return damage1 + damage2;
		}
		
		if(d20Roll == 1) {
			System.out.println("Critical Miss!");
			return 0;
		}
		
		if(d20Roll + aMod >= enemyDefenseValue){
			damage = die.roll(damageDice);
			System.out.println("Damage Dice Total:\t" + damage);
			System.out.println("\nHit! " + "Damage Dealt\t" +  damage);
		} else {
			System.out.println("Miss!");
		}
		return damage;
	}
}
