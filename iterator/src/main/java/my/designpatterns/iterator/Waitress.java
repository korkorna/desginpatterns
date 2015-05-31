package my.designpatterns.iterator;


public class Waitress {
	private PancakeHouseMenu breakfastMenu;
	private DinerMenu dinerMenu;
	private boolean vegetrian;
	
	public Waitress(PancakeHouseMenu pancakeHouseMenu, DinerMenu dinerMenu,
			boolean vegetrian) {
		super();
		this.breakfastMenu = pancakeHouseMenu;
		this.dinerMenu = dinerMenu;
		this.vegetrian = vegetrian;
	}

	public void printMenu() {
		Iterator breakfastMenuIt = breakfastMenu.createIterator();
		Iterator dinerMenuIt = dinerMenu.createIterator();
		System.out.println("메뉴\n-----\n아침 메뉴");
		printBreakfastMenu(breakfastMenuIt);
		System.out.println("\n저녁 메뉴");
		printDinnerMenu(dinerMenuIt);
	}
	
	public void printBreakfastMenu(Iterator breakfastMenu) {
		while(breakfastMenu.hasNext()){
			MenuItem menuItem = (MenuItem) breakfastMenu.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDecription());
		}
	}
	
	public void printDinnerMenu(Iterator dinerMenu) {
		while(dinerMenu.hasNext()){
			MenuItem menuItem = (MenuItem) dinerMenu.next();
			System.out.print(menuItem.getName() + " ");
			System.out.println(menuItem.getPrice() + " ");
			System.out.println(menuItem.getDecription());
		}
	}
	
	public void printVegetarianMenu() {
		Iterator breakfastMenuIt = breakfastMenu.createIterator();
		Iterator dinerMenuIt = dinerMenu.createIterator();
		
		while(breakfastMenuIt.hasNext()){
			MenuItem menuItem = (MenuItem) breakfastMenuIt.next();
			if(menuItem.isVegetarian()){
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDecription());
			}
		}
		
		while(dinerMenuIt.hasNext()){
			MenuItem menuItem = (MenuItem) dinerMenuIt.next();
			if(menuItem.isVegetarian()){
				System.out.print(menuItem.getName() + " ");
				System.out.println(menuItem.getPrice() + " ");
				System.out.println(menuItem.getDecription());
			}
		}
	}
	
	public boolean isVegetarian() {
		return vegetrian;
	}
}
