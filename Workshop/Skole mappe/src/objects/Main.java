package objects;

public class Main {

	public static void main(String[] args) {
		Robot optimusPrime = new Robot("black", 40, 100);
		optimusPrime.length = 40;
		Robot wallE = new Robot("black and yellow", 10, 3);
		wallE.length = 5;

		System.out.println(Robot.numberOfRobotsCreated + " robots are created");

		wallE.printStatus();

		optimusPrime.kill(wallE);

		wallE.printStatus();
		
		System.out.println( "rex is a bitch!!!");

	}
}
