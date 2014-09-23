package oblig1;

import java.util.Scanner;

public class Oppgave2 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("skriv inn tall på en linje ('e' for å avslutte)");
		
		while (!scan.hasNext("e")) {
			int counter = 0;
			double sum = 0.0;
			
			Scanner lnscan = new Scanner(scan.nextLine());
			while (lnscan.hasNextDouble()) {
				counter++;
				sum += lnscan.nextDouble();
			}
			lnscan.close();
			
			System.out.println(sum/counter);
		}

		System.out.println("avsluttet");
		scan.close();
	}

}
