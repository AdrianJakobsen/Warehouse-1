import java.util.Scanner;


public class Converter {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
				while (!exit) {
					System.out.println("Input amount of pounds: ");
					double pound = input.nextFloat();
					if (pound < 0) {
						System.out.println("There is no negatvie value of weight, Dumbass!!!");

					}
					else {
						double kilo = pound * 0.454; 
						System.out.println(pound + " Pounds is " + kilo + " Kilograms");

					}
				}
		input.close();
	}

}
