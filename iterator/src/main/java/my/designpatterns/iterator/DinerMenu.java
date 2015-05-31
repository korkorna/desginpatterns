package my.designpatterns.iterator;

public class DinerMenu {
	private static final int MAX_ITMES = 6;
	private MenuItem[] menuItems;
	private int numberOfItmes = 0;
	
	public DinerMenu() {
		menuItems = new MenuItem[MAX_ITMES];
		
		addItem("채식주의자용 BLT", "통밀 위에 (식물성) 베이컨, 상추, 토마토를 얹은 메뉴", true, 2.99);
		addItem("BLT", "통밀 위에 베이컨, 상추, 토아토를 얹은 메뉴", false, 2.99);
		addItem("오늘의 스프", "감자 샐러드를 곁들인 오늘의 스프", false, 3.29);
		addItem("핫도그", "사워크라우트, 갖은 양념, 양파, 치즈가 곁들여진 핫도그", false, 3.05);
		
	}

	private void addItem(String name, String desc, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
		
		if(numberOfItmes >= MAX_ITMES){
			System.out.println("죄송합니다. 메뉴가 꽉 찼습니다. 더 이상 추가할 수 없습니다.");
		}else{
			menuItems[numberOfItmes] = menuItem;
			numberOfItmes++;
		}
	}

	public Iterator createIterator() {
		return new DinerMenuIterator(menuItems);
	}
	
}
