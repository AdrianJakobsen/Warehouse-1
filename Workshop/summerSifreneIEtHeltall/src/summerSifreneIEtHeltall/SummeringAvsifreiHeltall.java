package summerSifreneIEtHeltall;

import java.util.Scanner;

public class SummeringAvsifreiHeltall {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while (!exit) {
			System.out.println("\n Input one Whole number between 0 and 1000:");
			int number = input.nextInt();
			if ( number > 0 && number < 1000) {
				int summering = (int) number % 10 + number % 100 / 10 + number /100;
				System.out.println("The sum is: " + summering );
			} 
			else {

				System.out.println("ERROR!!!");
			} 
		}
		input.close();
	}

}
