package fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;


public class FoodDelivery {
	public int restaurantIndex;
	private List<Restaurant> restaurants;
	private List<Food> foodList;
	public int numberOfFood;

	public  FoodDelivery() {
		restaurants = new ArrayList<>();
		this.foodList = new ArrayList<>();
	}

	public void creatFood(String name, String description,double price) {		
		restaurants.get(restaurantIndex-1).addFood(name, description, price);
	}

	public void addRestaurant(Restaurant restaurant) {
		restaurants.add(restaurant);
	}

	public void selectRestaurant(int restaurantIndex) {

	}

	public List<Restaurant> getRestaurants(){
		return restaurants;
	}

	public List<Food> getFood() {
		return foodList;
	}
	
	public void currentRestaurant(int restaurantIndex) {
		this.restaurantIndex = restaurantIndex;
	}

	public void numberOfFood(int numberOfFood) {
		this.numberOfFood = numberOfFood;
	}
	
	
}
