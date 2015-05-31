package my.designpatterns.iterator;

import java.util.Hashtable;
import java.util.Iterator;

@Deprecated
public class CafeMenu implements Menu{
	private Hashtable menuItems = new Hashtable();

	public CafeMenu() {
		addItem("베지 버거와 에어 프라이", "통밀빵, 상추, 토마토, 감자튀김이 첨가된 베지 버거", true, 3.99);
		addItem("오늘의 스프", "샐러드가 곁들여진 오늘의 스프", false, 3.69);
		addItem("베리토", "통 핀토콩과 살사, 구아카몰이 곁들여진 푸짐한 베리또", true, 4.29);
	}

	private void addItem(String name, String desc, boolean vegetarian, double price) {
		MenuItem menuItem = new MenuItem(name, desc, vegetarian, price);
		menuItems.put(menuItem.getName(), menuItem);
	}
	
	@Deprecated
	public Hashtable getItems() {
		return menuItems;
	}

	public Iterator createIterator() {
		return menuItems.values().iterator();
	}
}
