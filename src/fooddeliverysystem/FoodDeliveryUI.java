package fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

public class FoodDeliveryUI {
	private FoodDelivery foodDelivery;
	private Scanner keyboard;

	public FoodDeliveryUI(FoodDelivery foodDelivery) {
		this.foodDelivery = foodDelivery;
		this.keyboard = new Scanner(System.in);

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
		System.out.printf("Select Restaurant: ");


		//while
		int number = keyboard.nextInt();
		System.out.println("("+restaurants.get(number-1).getName() + ") 1. add food");
		System.out.println("("+restaurants.get(number-1).getName() + ") 2. check all food");
		System.out.println("("+restaurants.get(number-1).getName() + ") 3. back to restaurant selection");
		System.out.printf("Please enter selection: ");
		int options = keyboard.nextInt();
		switch (options) {
		case 1:
			System.out.printf("Please enter food name: ");
			String foodName = keyboard.next();
			System.out.printf("Please enter food description: ");
			String foodDescription = keyboard.next();
			System.out.printf("Please enter food price: ");
			double foodPrice = keyboard.nextInt();
			foodDelivery.creatFood(foodName, foodDescription, foodPrice);
			break;
		case 2:
			break;
		case 3: 
			returnToRestaurantSelection();
			break;
		default:
			
	        break;
		}

	}
	
	public void returnToRestaurantSelection() {
	    start();
	}


}