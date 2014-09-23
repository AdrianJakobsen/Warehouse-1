import java.util.Scanner;


public class ArealAvEtHexagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lenght of side: ");
		double lenght = input.nextDouble();
		input.close();
		
		double area = (Math.cbrt(3) / 2) * lenght * lenght;
		System.out.println("Area of Hexagon is: " + area);

	}

}
