package client;

import coffee.CoffeeAttendant;
import customer.Customer;

public class CoffeeShop {

	public static void main(String[] args) {
		Customer robert = new Customer.Builder().setName("Robert").orderDrink("French Vanilla").build();
		Customer bill = new Customer.Builder().setName("Bill").orderDrink("Hot Coffee").build();
		
		CoffeeAttendant coffeeAttendent = new CoffeeAttendant();
		coffeeAttendent.takeOrder(robert);
		coffeeAttendent.takeOrder(bill);
		
		// prepare drink
		coffeeAttendent.prepareDrink("French Vanilla");
		coffeeAttendent.prepareDrink("Hot Coffee");

		// order up...
		coffeeAttendent.callOutCompletedOrder();	
		}

}
