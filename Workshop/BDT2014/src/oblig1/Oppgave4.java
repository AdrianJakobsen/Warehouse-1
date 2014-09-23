package oblig1;

import java.util.Scanner;

public class Oppgave4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("mynt ('m') eller krone ('k')? ('e' for å avslutte)");
		
		while (!scan.hasNext("e")) {
			char ch = scan.next().charAt(0);
			boolean randbol = Math.random() < 0.5; // m = true, k = false
			
			boolean win;
			switch (ch) {
				case 'm':
					win = randbol;
					break;
				case 'k':
					win = !randbol;
					break;
				default:
					System.out.println("kun 'm', 'k' og 'e' er gyldig input, prøv igjen");
					continue;
			}
			
			String endMsg = 
					"du " 
					+ ((win) ? "vant" : "tapte")
					+ " med " 
					+ ((ch == 'k') ? "krone" : "mynt") 
					+ " over datamaskinens " 
					+ ((randbol) ? "mynt" : "krone");
			
			System.out.println(endMsg);
		}

		System.out.println("spillet er avsluttet");
		scan.close();
	}

}
