package springcore;

public class Restaurant {

	String welcomeNote;
	HotDrink hotDrink;
	
	Restaurant(HotDrink hotDrink){
		this.hotDrink = hotDrink;
	}
	
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
