package implementation;

public class Car {
	protected String color, owner, licenceplate;
	protected int numberOfGears, horsepower;
	
	public Car(){
		numberOfGears=3;
	}
	public Car(String color, String owner, String Licenceplate, int numberOfGears, int horsepower){
		this.color = color;
		this.owner = owner;
		this.licenceplate = Licenceplate;
		this.numberOfGears = numberOfGears;
		this.horsepower = horsepower;
	}
	@Override
	public String toString(){		
		return this.getClass().getSimpleName() + " : " + this.licenceplate;
	}
}