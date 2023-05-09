package fooddeliverysystem;

import java.util.List;

public class Restaurant {
	private List<Food> foods;
	private String name;
	
	public Restaurant(String name) {
		this.name = name;
	}
	
	public void addFood(String name, String description, double price) {
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Food> getFood(){
		return this.foods;
	}
	
}
