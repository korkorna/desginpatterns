package my.designpatterns.iterator;

import java.util.ArrayList;

@Deprecated
public class PancakeHouseMenuIterator implements Iterator{
	private ArrayList<MenuItem> menuItems;
	private int position = 0;
	
	public PancakeHouseMenuIterator(ArrayList<MenuItem> menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if(menuItems.isEmpty() || position >= menuItems.size()) {
			return false;
		}else{
			return true;
		}
	}

	public Object next() {
		MenuItem menuItem = menuItems.get(position);
		position++;
		return menuItem;
	}
	
}
