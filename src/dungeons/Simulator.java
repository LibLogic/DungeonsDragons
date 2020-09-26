package dungeons;

public class Simulator {
	
	public int Attack(int AC, int dMod, int aMod, String damageDice) {
		Die d20 = new Die();
		Die damageDie = new Die();
		int damage = 0;
		int enemyDefenseValue = AC + dMod;
		System.out.println("Enemy Defense Value:\t" + enemyDefenseValue);
		System.out.println("\nPlayer Attack Modifier:\t" + aMod);
		int d20Roll = d20.roll();

		if(d20Roll == -1) {
			int damage1 = damageDie.roll(damageDice);
			System.out.println("Total:\t\t\t" + damage1 + "\n");
			int damage2 = damageDie.roll(damageDice);
			System.out.println("Total:\t\t\t" + damage2);
			System.out.println("\nCritical Hit!\t" + damage1 + " + " + damage2 + "\nDamage = " + (damage1 + damage2));
			return damage1 + damage2;
		}
		
		if(d20Roll == 0) {
			System.out.println("Critical Miss!");
			return 0;
		}
		
		if(d20Roll + aMod > enemyDefenseValue){
			damage = damageDie.roll(damageDice);
			System.out.println("Damage Dice Total:\t" + damage);
			System.out.println("\nHit! " + "Damage Dealt\t" +  damage);
		} else {
			System.out.println("Miss!");
		}
		return damage;
	}
}
