import java.util.Scanner;

public class VolumOgArealAvSylinder {
	public static void main(String [] args){
		Scanner input = new Scanner (System.in);
		boolean exit = false;
		while(!exit) {

			System.out.println("Input radius: ");
			double radius = input.nextDouble();
			if (radius < 0) {
				System.out.println("Radius can not be negative");
			}
			else {
				System.out.println("input lenght: ");
				double lenght = input.nextDouble();
				if (lenght < 0 ){
					System.out.println("lenght can not be negative");
				}

				else {
					double area = radius * radius * 3.14159;
					double voulum = area * lenght;
					System.out.println("The area of the sylinder is " + area + " and the volum is " + voulum);
				}
			}

		}
		input.close();
	}
}
