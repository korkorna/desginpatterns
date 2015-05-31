package my.designpatterns.iterator;

public class DinerMenuIterator implements Iterator{
	private MenuItem[] menuItems;
	private int position = 0;
	
	public DinerMenuIterator(MenuItem[] menuItems) {
		super();
		this.menuItems = menuItems;
	}

	public boolean hasNext() {
		if(position >= menuItems.length || menuItems[position] == null){
			return false;
		}else{
			return true;
		}
	}

	public Object next() {
		MenuItem menuItem = menuItems[position];
		position++;
		return menuItem;
	}

}
