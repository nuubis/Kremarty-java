package game;

public class Character{
	
	String name;
	String gender;
	int health;
	int mana;
	Inventory playerInventory;
	
	String race;
	int strength;
	int defence;
	int intelligence;
	int agility;
	
	public void HumanCharacter(String name, String gender, int health, int mana, Inventory playerInventory, String race,
			int strength, int agility) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.mana = mana;
		this.playerInventory = playerInventory;
		this.race = race;
		this.strength = strength;
		this.agility = agility;
	}

	public void ElfCharacter(String name, String gender, int health, int mana, Inventory playerInventory, String race,
			int intelligence, int agility) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.mana = mana;
		this.playerInventory = playerInventory;
		this.race = race;
		this.intelligence = intelligence;
		this.agility = agility;
	}

	public void DwarfCharacter(String name, String gender, int health, int mana, Inventory playerInventory, String race,
			int strength, int defence) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.mana = mana;
		this.playerInventory = playerInventory;
		this.race = race;
		this.strength = strength;
		this.defence = defence;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
