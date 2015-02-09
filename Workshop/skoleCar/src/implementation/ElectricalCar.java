package implementation;

public class ElectricalCar extends Car {
	
	private int charge;
	private int batteryCharge;
	
	public ElectricalCar(){
		this.color = "white";
		this.owner = "me";
		this.licenceplate = "CF 22054";
		//this.numberOfGears = 5;
		this.horsepower = 100;
	}
	public String toString(){
		return "Electric is the future of the vehicle world";
	}
	
}
