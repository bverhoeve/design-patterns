package iterator.dinermerger;

import java.util.Iterator;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
 
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu) {
		this.pancakeHouseMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
	}
 
	public void printMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();

		System.out.println("Menu\n---\nBreakfast");
		printMenu(pancakeIterator);
		System.out.println("Menu\n---\nLunch");
		printMenu(dinerIterator);
	}

	public void printMenu(Iterator iterator) {
		while(iterator.hasNext()) {
			MenuItem item = (MenuItem) iterator.next();
			System.out.println(item.toString());
		}
	}
 
	public void printVegetarianMenu() {
		Iterator pancakeIterator = pancakeHouseMenu.createIterator();
		Iterator dinerIterator = dinerMenu.createIterator();
		
	while(dinerIterator.hasNext() && pancakeIterator.hasNext()) {
			
			MenuItem panItem = (MenuItem) pancakeIterator.next();
			MenuItem dinerItem = (MenuItem) dinerIterator.next();
			
			if(isItemVegetarian(panItem)) {
				System.out.println(panItem.toString());
			}
			
			if(isItemVegetarian(dinerItem)) {
				System.out.println(dinerItem.toString());
			}
		}
		
	}
		
	
 
	public void printLunchMenu() {
		Iterator dinerIterator = dinerMenu.createIterator();

		printMenu(dinerIterator);
		
	}

	public void printBreakfastMenu() {
		Iterator panIterator = pancakeHouseMenu.createIterator();

		printMenu(panIterator);	
	}

	public boolean isItemVegetarian(MenuItem item) {
		
		return item.vegetarian;
	
		
	}
}
