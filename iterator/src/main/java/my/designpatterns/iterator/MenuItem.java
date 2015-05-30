package my.designpatterns.iterator;

public class MenuItem {
	private String name;
	private String decription;
	private boolean vegetarian;
	private double price;
	
	public MenuItem(String name, String decription, boolean vegetarian,
			double price) {
		super();
		this.name = name;
		this.decription = decription;
		this.vegetarian = vegetarian;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDecription() {
		return decription;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public double getPrice() {
		return price;
	}

}
