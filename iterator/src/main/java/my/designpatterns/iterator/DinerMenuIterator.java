package my.designpatterns.iterator;

import java.util.Iterator;

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

	public void remove() {
		// TODO Auto-generated method stub
//		throw new UnsupportedOperationException();
		if(position <= 0) {
			throw new IllegalStateException("next()를 한번도 호출하지 않는 상태에서는 삭제할 수 없습니다.");
		}
		
		if(menuItems[position-1] != null) {
			for(int i = position - 1; i < menuItems.length-1; i++) {
				menuItems[i] = menuItems[i+1];
			}
			
			menuItems[menuItems.length-1] = null;
		}
		
	}

}
