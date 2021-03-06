package iterator.dinermerger;

import java.util.*;

public class MenuTestDrive {
	public static void main(String args[]) {
        // PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        // DinerMenu dinerMenu = new DinerMenu();
 
		// Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		// waitress.printMenu();
		printMenus();
		
		// printMenus();
	}
	
	/*
	 * Without the Waitress, we need the code below...
	 */
	public static void printMenus() {
		PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();

		//Iterable<MenuItem> breakfastItems = (Iterable<MenuItem>) pancakeHouseMenu.createIterator();
		//Iterable<MenuItem> lunchItems = (Iterable<MenuItem>) dinerMenu.createIterator();
		Iterator<MenuItem> breakfastItems =  pancakeHouseMenu.createIterator();
		
		// print as Iterable
		printMenu(breakfastItems);
		//printMenu(lunchItems);
	}
		// print with forEach
//		System.out.println("=== forEach ===");
//		breakfastItems.forEach(item -> System.out.println(item));
//		Arrays.asList(lunchItems).forEach(item -> System.out.println(item));
//		System.out.println("=== forEach ===");
//		
//		// Using enhanced for loop
//		System.out.println("USING ENHANCED FOR");
//		for (MenuItem menuItem : breakfastItems) {
//			System.out.print(menuItem.getName());
//			System.out.println("\t\t" + menuItem.getPrice());
//			System.out.println("\t" + menuItem.getDescription());
//		}
//		for (MenuItem menuItem : lunchItems) {
//			System.out.print(menuItem.getName());
//			System.out.println("\t\t" + menuItem.getPrice());
//			System.out.println("\t" + menuItem.getDescription());
//		}
// 
//		// Exposing implementation
//		System.out.println("USING FOR LOOPS");
//		for (int i = 0; i < breakfastItems.size(); i++) {
//			MenuItem menuItem = (MenuItem)breakfastItems.get(i);
//			System.out.print(menuItem.getName());
//			System.out.println("\t\t" + menuItem.getPrice());
//			System.out.println("\t" + menuItem.getDescription());
//		}
//
//		for (int i = 0; i < lunchItems.length; i++) {
//			MenuItem menuItem = lunchItems[i];
//			System.out.print(menuItem.getName());
//			System.out.println("\t\t" + menuItem.getPrice());
//			System.out.println("\t" + menuItem.getDescription());
//		}
//	}
//	
	public static void printMenu(Iterator<MenuItem> a) {
		while(a.hasNext()) {
			MenuItem menuItem = a.next();
			System.out.print(menuItem.getName());
			System.out.println("\t\t" + menuItem.getPrice());
			System.out.println("\t" + menuItem.getDescription());
		}
	}
}
