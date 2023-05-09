package fooddeliverysystem;

public class Food {
	private int id;
	private String name;
	private String description;
	private double price;
	
	public Food(int id, String name, String description, double price) {
		
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
