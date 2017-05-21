package game;

public class ElfCharacter extends Character {
	
	int mana;
	int intelligence;
	int agility;
	
	public ElfCharacter(String name, String gender, int health, Inventory playerInventory, int money, String race,
			int mana, int intelligence, int agility) {
		super(name, gender, health, playerInventory, money, race);
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.mana = mana;
		this.intelligence = intelligence;
		this.agility = agility;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}
	
	
	
}
