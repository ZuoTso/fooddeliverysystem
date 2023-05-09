package fooddeliverysystem;

public class Food {
	private int id;
	private String name;
	private String description;
	private double price;
	
	public Food(int id, String name, String description, double price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
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
	
	/*public void getid(int id) {
		this.id = id;
	}*/
}
