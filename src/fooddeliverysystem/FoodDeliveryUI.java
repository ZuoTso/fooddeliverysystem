package fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

public class FoodDeliveryUI {
	private FoodDelivery foodDelivery;
	Scanner keyboard = new Scanner(System.in);

	public FoodDeliveryUI(FoodDelivery foodDelivery) {
		this.foodDelivery = foodDelivery;
		
		//creating initial restaurants
		Restaurant restaurant1 = new Restaurant("Starbucks");
		Restaurant restaurant2 = new Restaurant("Mcdonald's");
		Restaurant restaurant3 = new Restaurant("KFC");
		this.foodDelivery.addRestaurant(restaurant1);
		this.foodDelivery.addRestaurant(restaurant2);
		this.foodDelivery.addRestaurant(restaurant3);
	}

	
	public void start() {

		List<Restaurant> restaurants = foodDelivery.getRestaurants();
		for (int i = 0; i < restaurants.size(); i++) {
	        System.out.println((i + 1) + ". " + restaurants.get(i).getName());
	    }
	    System.out.println("Select Restaurant:");
	    
	    
	    //while
	    int number = keyboard.nextInt();

	}

}