package my.designpatterns.iterator;

import java.util.ArrayList;

public class Waitress {
	private ArrayList<MenuItem> breakfastMenu;
	private MenuItem[] dinerMenu;
	private boolean vegetrian;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,
			boolean vegetrian) {
		super();
		this.breakfastMenu = pancakeHouseMenu.getMenuItems();
		this.dinerMenu = dinerMenu.getMenuItems();
		this.vegetrian = vegetrian;
	}

	public void printMenu() {
		printBreakfastMenu();
		printDinnerMenu();
	}
	
	public void printBreakfastMenu() {
		for (int i = 0; i < breakfastMenu.size(); i++) {
			MenuItem menuItem = breakfastMenu.get(i);
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDecription());
		}
	}
	
	public void printDinnerMenu() {
		for (int i = 0; i < dinerMenu.length; i++) {
			MenuItem menuItem = dinerMenu[i];
		
			if(menuItem == null) continue;
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDecription());
		}
	}
	
	public void printVegetarianMenu() {
		
	}
	
	public boolean isVegetarian() {
		return vegetrian;
	}
}
