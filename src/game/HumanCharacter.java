package game;

public class HumanCharacter extends Character {

	int energy;
	int strength;
	int agility;
	
	public HumanCharacter(String name, String gender, int health, Inventory playerInventory, int money, String race,
			int energy, int strength, int agility) {
		super(name, gender, health, playerInventory, money, race);
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.energy = energy;
		this.strength = strength;
		this.agility = agility;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	
	

}
