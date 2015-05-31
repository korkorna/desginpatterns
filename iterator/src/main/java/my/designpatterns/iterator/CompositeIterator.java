package my.designpatterns.iterator;

import java.util.Iterator;
import java.util.Stack;

public class CompositeIterator implements Iterator {
	private Stack stack = new Stack();
	
	public CompositeIterator(Iterator iterator) {
		super();
		this.stack.push(iterator);
	}

	public boolean hasNext() {
		if(stack.empty()) {
			return false;
		} else {
			Iterator iterator = (Iterator) stack.peek();
			if(!iterator.hasNext()) {
				stack.pop();
				return hasNext();
			} else {
				return true;
			}
		}
	}

	public Object next() {
		if(hasNext()) {
			Iterator iterator = (Iterator) stack.peek();
			MenuComponent component = (MenuComponent) iterator.next();
			if(component instanceof Menu) {
				stack.push(component.createIterator());
			}
			return component;
		} else {
			return null;
		}
	}

	public void remove() {
		// TODO Auto-generated method stub

	}

}
