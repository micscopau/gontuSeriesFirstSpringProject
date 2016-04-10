package springcore;

import java.util.List;

public class Restaurant {

	private String welcomeNote;
	HotDrink hotDrink;
	
	private List restaurantWaitersList;
	
	public void init(){
		System.out.println("Restaurant Bean is going through initialization.");
	}
	
	public void destroy(){
		System.out.println("Bean is being destroyed!");
	}
	
	
	public void setRestaurantWaitersList(List restaurantWaitersList) {
		this.restaurantWaitersList = restaurantWaitersList;
	}

	public void displayWaitersNames() {

		System.out.println("All waiters working in Restaurant  :  " + restaurantWaitersList);
	}
	
	public void setHotDrink(HotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
	/*
	//Constructor Method
	Restaurant(HotDrink hotDrink){
		this.hotDrink = hotDrink;
	}*/
	
	public void prepareHotDrink(){
		hotDrink.prepareHotDrink();
	}
	
	public String getWelcomeNote() {
		return welcomeNote;
	}
	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void greetCustomer(){
		
		System.out.println(welcomeNote);
	}
	
	
	
	
}
