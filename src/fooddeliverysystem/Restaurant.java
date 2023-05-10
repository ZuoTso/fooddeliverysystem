package fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
	private List<Food> foods;
	private String name;
	
	public Restaurant(String name) {
		this.name = name;
		this.foods = new ArrayList<>();
		
	}
	
	public void addFood(String name, String description, double price) {
		int foodId = foods.size() + 1; 
	    Food newFood = new Food(foodId, name, description, price);
	    foods.add(newFood);
	}
	
	public String getName() {
		return this.name;
	}
	
	public List<Food> getFood(){
		return foods;
	}
	
}
