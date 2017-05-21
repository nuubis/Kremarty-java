package game;

public class Character{
	
	String name;
	String gender;
	String race;
	int health;
	Inventory playerInventory;
	int money;
	
	public Character(String name, String gender, int health, Inventory playerInventory, int money, String race) {
		
		this.name = name;
		this.gender = gender;
		this.health = health;
		this.playerInventory = playerInventory;
		this.money = money;
		this.race = race;
	}


	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
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
