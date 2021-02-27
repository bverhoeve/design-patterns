package iterator.dinermerger;

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
			MenuItem item = iterator.next();
			System.out.println(item.toString());
		}
	}
 
	public void printVegetarianMenu() {
		// Print the vegetarian menu
	}
 
	public void printLunchMenu() {
		// Print the lunch menu
	}

	public void printBreakfastMenu() {
		// TODO
	}

	public void isItemVegetarian(String name) {
		// TODO
	}
}
