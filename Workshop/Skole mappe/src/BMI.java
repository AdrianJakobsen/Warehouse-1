import java.util.Scanner;


public class BMI {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in Kg: ");
		double weight = input.nextDouble();
		
		System.out.println("Enter height in Meter: ");
		double height = input.nextDouble();
		
		double mbi = weight / (height * height);
		
		input.close();
		
		System.out.println("BMI is " + mbi);
	}

}
