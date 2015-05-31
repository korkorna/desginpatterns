package my.designpatterns.iterator;

import java.util.Iterator;

public class Waitress {
	private MenuComponent allMenus;
	
	public Waitress(MenuComponent allMenus) {
		super();
		this.allMenus = allMenus;
	}

	public void printMenu() {
		allMenus.print();
	}
	
	public void printVegetarianMenu() {
		Iterator iterator = allMenus.createIterator();
		System.out.println("\n채식주의자 메뉴\n--------------");
		
		while(iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			
			try {
				if(menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
				// TODO: handle exception
			}
		}
	}
	
	@Deprecated
	private void printMenu(Iterator iter) {
		while(iter.hasNext()){
			MenuItem menuItem = (MenuItem) iter.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	@Deprecated
	private void printBreakfastMenu(Iterator breakfastMenu) {
		while(breakfastMenu.hasNext()){
			MenuItem menuItem = (MenuItem) breakfastMenu.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
	@Deprecated
	private void printDinnerMenu(Iterator dinerMenu) {
		while(dinerMenu.hasNext()){
			MenuItem menuItem = (MenuItem) dinerMenu.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDescription());
		}
	}
	
}
