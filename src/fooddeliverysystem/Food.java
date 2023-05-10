package fooddeliverysystem;

public class Food {
	private int id;
	private String name;
	private String description;
	private double price;
	private static int foodCounter = 0;
	
	public Food(int id, String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.id = ++foodCounter;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDescription() {
		return description;
	}
	
	
	//given double return string
	public double getPrice() {
		return price;
	}
	
	public int getid() {
		return id;
	}
	
}
