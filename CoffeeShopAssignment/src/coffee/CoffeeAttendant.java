package coffee;

import java.util.ArrayList;
import java.util.List;

import customer.Customer;
import customer.WaitingCustomer;

public class CoffeeAttendant {

	private List<WaitingCustomer> customerList;
	private List<String> completedDrinks;
	
	public CoffeeAttendant() {
		customerList = new ArrayList<WaitingCustomer>();
		completedDrinks = new ArrayList<String>();
	}
	
	public void takeOrder(Customer customer) {
		customerList.add(customer);
		System.out.println("Coffee Attendent: '" + customer.getName()
		+ ", I've started working on your order of "
		+ customer.getDrinkOrdered() + "'");
	}
	
	public void prepareDrink(String drinkToPrepare) {
		double timeTaken = Math.random();
		try {
			Thread.sleep((long)(timeTaken*1000));
			completedDrinks.add(drinkToPrepare);
		} catch (InterruptedException e) {
			System.out.println("For some reason coffee is not prepared");
		}
	}
	
	public void callOutCompletedOrder() {
		
		for(String readyDrink : completedDrinks) {
			System.out.println("Order up: " + readyDrink);
			for(WaitingCustomer customer : customerList) {
				customer.orderReady(readyDrink);
			}
		}
	}
	
}
