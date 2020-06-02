package customer;

public class Customer implements WaitingCustomer{

	private String name;
	private String drinkOrdered;
	
	
	private Customer(Builder builder) {
		this.name = builder.name;
		this.drinkOrdered=builder.drinkOrdered;
	}
	
	@Override
	public void orderReady(String completedDrink) {
		if (drinkOrdered.equals(completedDrink))
			exitStore();
	}

	private void exitStore() {
		System.out.println(name + ": Thank you, I've recieved my "
				+ drinkOrdered + " and leaving the store now...");
	}
	
	public static class Builder{
		
		private String name;
		private String drinkOrdered;
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder orderDrink(String drinkOrdered) {
			this.drinkOrdered = drinkOrdered;
			return this;
		}
		
		public Customer build(){
			return new Customer(this);
		}
	}
	
	public String getName() {
		return this.name;
	}

	public String getDrinkOrdered() {
		// TODO Auto-generated method stub
		return this.drinkOrdered;
	}	
}