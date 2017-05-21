package game;

public class Item {

	String itemName;
	String type;
	int amount;
	
	public Item(String itemName, String type, int amount) {
		super();
		this.itemName = itemName;
		this.type = type;
		this.amount = amount;
	}

	public String getItemName() {
		return itemName;
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
	
	

	
	
	
}
