package game;

import java.util.ArrayList;

public class Inventory {
	
	ArrayList<Item> inventoryItems = new ArrayList<>();

	public ArrayList<Item> getInventoryItems() {
		return inventoryItems;
	}

	public void setInventoryItems(ArrayList<Item> inventoryItems) {
		this.inventoryItems = inventoryItems;
	}
	
	public void addItem(Item item){
		inventoryItems.add(item);
	}
	
	public void removeItem(Item item){
		inventoryItems.remove(item);
	}
	
}
