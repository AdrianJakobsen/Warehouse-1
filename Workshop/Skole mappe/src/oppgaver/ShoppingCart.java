package oppgaver;

import java.util.ArrayList;
import java.util.Iterator;


public class ShoppingCart {
	private ArrayList<Item> list;
	private String valuta;

	public ShoppingCart (){
		list = new ArrayList<Item>();
		valuta = "KR";
	}
	public void addToCart(Item item){
		list.add(item);
	}
	public void showCart(){	
		StringBuilder itemList = new StringBuilder();
		for (Item item : list) {
			String listString = "|" + item.getItemName() + " " + item.getPrice() + valuta + "| ";
			itemList.append(listString);
		}
		System.out.print("|"+ itemList.toString() + "| \n"); // laget en overide av toString så denne fungerer. og kaller på seg selv (skal stå 'this' på itemlist.tost
	}


	@Override
	public String toString(){
		StringBuilder itemList = new StringBuilder();
		for (Item item : list) {
			String listString = item.getPrice() + item.getItemName();
			itemList.append(listString);
		}
		return itemList.toString();
	}
}
