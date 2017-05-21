package game;

public class Character{
	
	String name;
	String gender;
	int health;
	int mana;
	int energy;
	int rage;
	Inventory playerInventory;
	int money;
	
	String race;
	int strength;
	int defence;
	int intelligence;
	int agility;
	
	public void HumanCharacter(String name, String gender, int health, int energy, Inventory playerInventory, int money, String race,
			int strength, int agility) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.energy = energy;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.strength = strength;
		this.agility = agility;
	}

	public void ElfCharacter(String name, String gender, int health, int mana, Inventory playerInventory, int money, String race,
			int intelligence, int agility) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.mana = mana;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.intelligence = intelligence;
		this.agility = agility;
	}

	public void DwarfCharacter(String name, String gender, int health, int rage, Inventory playerInventory, int money, String race,
			int strength, int defence) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.rage = rage;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
		this.strength = strength;
		this.defence = defence;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getRage() {
		return rage;
	}

	public void setRage(int rage) {
		this.rage = rage;
	}

	public Inventory getPlayerInventory() {
		return playerInventory;
	}

	public void setPlayerInventory(Inventory playerInventory) {
		this.playerInventory = playerInventory;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
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

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public String getRace() {
		return race;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
