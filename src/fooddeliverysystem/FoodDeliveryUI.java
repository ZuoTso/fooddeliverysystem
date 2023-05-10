package fooddeliverysystem;

import java.util.List;
import java.util.Scanner;

public class FoodDeliveryUI {
	private FoodDelivery foodDelivery;
	private Scanner keyboard;
	public List<Restaurant> restaurants;
	public int numberOfFood;
	public int currentRestaurant;

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
		numberOfFood = 1 ;
		
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
				System.out.printf("請選擇畫面上的餐廳: ");
				number = keyboard.nextInt();
			}
		}
		
		foodDelivery.currentRestaurant(number);

		System.out.println("("+restaurants.get(number-1).getName() + ")1. 新增食物");
		System.out.println("("+restaurants.get(number-1).getName() + ")2. 查看所有食物");
		System.out.println("("+restaurants.get(number-1).getName() + ")3. 返回餐廳選擇");
		selectMode();

	}

	private void selectMode() {

		System.out.printf("請輸入選擇: ");
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

		System.out.printf("請輸入正確選項: ");
		int options = keyboard.nextInt();

		switch (options) {
		case 1:
			foodDelivery.numberOfFood(numberOfFood);
			numberOfFood++;
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
		
		System.out.printf("請輸入食物名稱: ");
		String token = keyboard.nextLine();
	    String foodName = keyboard.nextLine();
	    System.out.printf("請輸入食物描述: ");
	    //String token1 = keyboard.nextLine();
	    String foodDescription = keyboard.nextLine();
	    System.out.printf("請輸入食物價格: ");
	    //String token2 = keyboard.next();
	    double foodPrice = keyboard.nextDouble();
		if(foodPrice<=0)
			while(foodPrice<=0) {
				System.out.println("價錢必須大於零，請重新輸入。");
				System.out.printf("請輸入食物價格: ");
				foodPrice = keyboard.nextDouble();
			}
		foodDelivery.creatFood(foodName, foodDescription, foodPrice);
	}

	private void returnToRestaurantSelection() {
		start();
	}

	private void checkAllFood() {
		System.out.printf("%-8s %-16s %-8s %-8s\n","No.","Name","Price","Description");
	    Restaurant selectedRestaurant = restaurants.get(foodDelivery.restaurantIndex - 1);
	    List<Food> foodList = selectedRestaurant.getFood();
	    
	    for (int i = 0; i < foodList.size(); i++) {
	        Food food = foodList.get(i);
	        System.out.printf("%-8d %-16s %-8.2f %-8s\n", food.getid(), food.getName(), food.getPrice(), food.getDescription());
	    }
	}



}