package fooddeliverysystem;

import java.util.ArrayList;
import java.util.List;


public class FoodDelivery {
	private int restaurantIndex;
	private List<Restaurant> restaurants;
	
	public  FoodDelivery() {
		restaurants = new ArrayList<>();
	}
	
	public void creatFood(String name, String description,double price) {
		
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
	    List<Food> foodList = new ArrayList<>();
	    for (Restaurant restaurant : restaurants) {
	        foodList.addAll(restaurant.getFood());
	    }
	    return foodList;
	}


}
