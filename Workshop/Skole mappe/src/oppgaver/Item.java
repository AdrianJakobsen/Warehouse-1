package oppgaver;

public class Item {
	
	private double price;
	private String itemName;
	public Item(){
		price = 0;
		itemName = "";
	}
	public double getPrice(){
		return price;
	}
	public String getItemName(){
		return itemName;
	}
	public void setItemName(String itemName){
		this.itemName = itemName;
	}
	public void setPrice (double price){
		this.price = price;
	}
}
