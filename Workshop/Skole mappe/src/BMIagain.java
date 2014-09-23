import java.util.Scanner;
public class BMIagain {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter weight in Kg: ");
		double weight = input.nextDouble();

		System.out.println("Enter height in Meter: ");
		double height = input.nextDouble();

		double mbi = weight / (height * height);

		input.close();

		if (mbi < 18.5) {
			System.out.println("BMI is " + mbi + "\n You are underweight");
		} else if (mbi < 25) {
			System.out.println("BMI is " + mbi + "\n You are normal");

		} else if (mbi < 30){
			System.out.println("BMI is " + mbi + "\n You are overweight");

		} else if (mbi > 30){
			System.out.println("BMI is " + mbi + "\n You are a Fattas");
		}

	}

}


