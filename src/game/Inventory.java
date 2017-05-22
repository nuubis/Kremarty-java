package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	
	ArrayList<Item> inventoryItems = new ArrayList<>();
	
	public Inventory(ArrayList<Item> inventoryItems) {
		super();
		this.inventoryItems = inventoryItems;
	}

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
	
	public void itemsFromFileToArray(String fileName) throws FileNotFoundException{
		File inventory = new File(fileName);
		Scanner invReader = new Scanner(inventory);
		inventoryItems.add(new Item("Apple", "Food", "Common", "Good and crunchy", 1, 2));
	}
	
}
