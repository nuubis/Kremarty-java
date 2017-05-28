package game;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Inventory {
	
	public ArrayList<Item> inventoryItems;
	
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
	
	public void itemsFromFileToArray(File inventory) throws FileNotFoundException{
		//File inventory = new File(fileName);
		Scanner invReader = new Scanner(inventory);
		String line;
		String[] temporaryItem;
		while(invReader.hasNextLine()){
			line = invReader.nextLine();
			temporaryItem = line.split(",");
			
			inventoryItems.add(new Item(temporaryItem[0], temporaryItem[1], temporaryItem[2], temporaryItem[3], 
					Integer.parseInt(temporaryItem[4]), Integer.parseInt(temporaryItem[5])));
		}
		invReader.close();
		
	}
	
}
