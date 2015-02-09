package oppgave11_2;

public class Person {

	private String name;
	private String address;
	private int number;
	private String email;

	public Person(){
		this.name = "Jon";
		this.address = "Dronningens gate";
		this.number = 99571396;
		this.email = "adrjak.aj@gmail.com";
	}
	
	public Person(String name, String adress, int number, String email) {
		this.name = name;
		this.address = adress;
		this.number = number;
		this.email = email;
	}

	public String getName() {
		return this.name;
	}

	public String getAddress() {
		return this.address;
	}

	public int getNumber() {
		return this.number;
	}

	public String getEmail() {
		return this.email;
	}
	@Override
	public String toString(){
		String output = this.name+"\n"+this.address+"\n"+this.number+"\n"+this.email;
		return output;
	}
	
}
