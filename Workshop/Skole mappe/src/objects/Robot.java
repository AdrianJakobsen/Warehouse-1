package objects;

public class Robot {
	String color;
	int length;
	int weigth;
	boolean isAlive;

	public static int numberOfRobotsCreated =0;


	public Robot(){
		isAlive = true;
		numberOfRobotsCreated++;
	}

	public void printStatus(){
		if(this.isAlive){
			System.out.println("Happines:)");
		}else{
			System.out.println("Death is a cruel person :");	
		}
	}

	public Robot(String color, int length, int weigth){
		this.color = color; 
		this.length = length;
		this.weigth = weigth;
		isAlive = true;
		numberOfRobotsCreated++;
	}
	public void kill(Robot robotToKill){
		robotToKill.isAlive = false;
		
	}
}