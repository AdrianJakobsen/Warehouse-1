package oblig1;

import java.util.Random;
import java.util.Scanner;

public class Oppgave5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("stein ('s'), saks ('a') "
				+ "eller papir ('p')? ('e' for å avslutte)");
		
		while (!scan.hasNext("e")) {
			// scan user input
			char ch = scan.next().charAt(0);
			
			 // translate player input into an int code
			int playa =
					(ch == 's') ? -1 : // -1 if stein
				(ch == 'a') ? 0 :  // 0 if saks
					(ch == 'p') ? 1 : // 1 if papir
				1337; // leet if invalid input
			
			// if bad input
			if (playa == 1337) {
				System.out.println("kun 's', 'a', 'p' og 'e' er tillatt input");
				continue;
			}
			
			// get random computer move
			int comp = rand.nextInt(3)-1; // -1 = stein, 0 = saks, 1 = papir
			
			// calculate game outcome
			int result; // -1: fail, 0: tie, 1: win
			if (comp == playa)
				result = 0; // tie
			else if (comp == (playa - 1) || comp == (playa + 2))
				result = -1; // fail
			else 
				result = 1; // win
			
			// translate game result into human language
			String endMsg = (result == 0) ? "uavgjort" : (result == 1) ? "seier" : "nederlag";
			
			// add some additional information
			endMsg += " med " + ((playa == -1) ? "stein" : (playa == 0) ? "saks" : "papir") 
					+ " mot datamaskinens " + ((comp == -1) ? "stein" : (comp == 0) ? "saks" : "papir");
			
			// print result msg
			System.out.println(endMsg);
		}

		System.out.println("spillet er avsluttet");
		scan.close();
	}

}
