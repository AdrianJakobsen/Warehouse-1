package oppgaver;

import java.util.Scanner;

public class TestShopping {
	public static void main(String[] args) {
		Item item = new Item();
		ShoppingCart shopCart = new ShoppingCart();
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while(exit !=true){
		
		System.out.println("Please the enter Name of the Item: ");
		String name = input.next();
		item.setItemName(name);
		System.out.println("Please enter the Price of the Item: ");
		double price = input.nextDouble();
		item.setPrice(price);
			shopCart.addToCart(item);
			shopCart.toString();
			shopCart.showCart();
		}

	}

}
