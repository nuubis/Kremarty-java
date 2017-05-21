package game;

public class DwarfCharacter extends Character {
	
	int rage;
	int strength;
	int defence;
	

	public DwarfCharacter(String name, String gender, int health, Inventory playerInventory, int money, String race,
			int rage, int strength, int defence) {
		super(name, gender, health, playerInventory, money, race);
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.rage = rage;
		this.strength = strength;
		this.defence = defence;
	}
	
	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDefence() {
		return defence;
	}

	public void setDefence(int defence) {
		this.defence = defence;
	}
	
	

}
