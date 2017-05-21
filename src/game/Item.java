package game;

public class Item {

	String name;
	String type;
	String rarity;
	String description;
	int amount;
	int price;
	
	public Item(String name, String type, int amount, String description) {
		super();
		this.name = name;
		this.type = type;
		this.amount = amount;
		this.description = description;
	}

	public String getItemName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public String getDescription() {
		return description;
	}
	
	
	

	
	
	
}
