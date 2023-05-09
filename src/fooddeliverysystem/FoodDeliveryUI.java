package fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

public class FoodDeliveryUI {
	private FoodDelivery foodDelivery;
	private Scanner keyboard;
	public List<Restaurant> restaurants;

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
		restaurants = foodDelivery.getRestaurants();
	}
	

	public void start() {

		
		for (int i = 0; i < restaurants.size(); i++) {
			System.out.println((i + 1) + ". " + restaurants.get(i).getName());
		}
		System.out.printf("Select Restaurant: ");
		int number = keyboard.nextInt();

		//legal entry restaurant
		if (number == -1) System.exit(0);
		else if (number<=0||number>restaurants.size()) {
			while(number<=0||number>restaurants.size()) {
				System.out.printf("Please select a restaurant on the screen: ");
				number = keyboard.nextInt();
			}
		}


		foodDelivery.currentRestaurant(number);

		System.out.println("("+restaurants.get(number-1).getName() + ") 1. add food");
		System.out.println("("+restaurants.get(number-1).getName() + ") 2. check all food");
		System.out.println("("+restaurants.get(number-1).getName() + ") 3. back to restaurant selection");
		selectMode();

	}

	private void selectMode() {

		System.out.printf("Please enter selection: ");
		int options = keyboard.nextInt();

		switch (options) {
		case 1:
			inputFoodData();
			selectMode();
			break;

		case 2:
			checkAllFood();
			selectMode();
			break;

		case 3: 
			returnToRestaurantSelection();
			break;
		default:
			reselectMode();
			break;
		}

	}
	
	private void reselectMode() {

		System.out.printf("Please enter the correct option: ");
		int options = keyboard.nextInt();

		switch (options) {
		case 1:
			inputFoodData();
			selectMode();
			break;

		case 2:
			checkAllFood();
			selectMode();
			break;

		case 3: 
			returnToRestaurantSelection();
			break;
		default:
			reselectMode();
			break;
		}

	}

	private void inputFoodData() {
		System.out.printf("Please enter food name: ");
		String foodName = keyboard.next();
		System.out.printf("Please enter food description: ");
		String foodDescription = keyboard.next();
		System.out.printf("Please enter food price: ");
		double foodPrice = keyboard.nextDouble();
		if(foodPrice<=0)
			while(foodPrice<=0) {
				System.out.printf("Price must be greater than zero, please re-enter: ");
				foodPrice = keyboard.nextDouble();
			}
		foodDelivery.creatFood(foodName, foodDescription, foodPrice);
	}

	private void returnToRestaurantSelection() {
		start();
	}

	private void checkAllFood() {
		System.out.printf("%-8s %-16s %-8s %-8s\n","No.","Name","Price","Sescription");
		List<Restaurant> restaurants = foodDelivery.getRestaurants();
	    for (int i = 0; i < restaurants.size(); i++) {
	        Restaurant restaurant = restaurants.get(i);
	        List<Food> foodList = restaurant.getFood();
	        for (int j = 0; j < foodList.size(); j++) {
	            Food food = foodList.get(j);
	            System.out.printf("%-8d %-16s %-8.2f %-8s\n", j+1, food.getName(), food.getPrice(), food.getDescription());
	        }
	    }
	}

}