package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class arraysOppgave6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 3 Integers:(enter space between each value) ");

		int [] arrayToBeCopied = new int [3];
		int [] arrayCopyPlace = new int []{2, 23,52,100,4};

		for (int i= 0; i<arrayToBeCopied.length; i++){
			int userIntegerChoice = scanner.nextInt();
			arrayToBeCopied[i] = userIntegerChoice;
		}
		for(int i=0; i<arrayToBeCopied.length; i++){
			arrayCopyPlace[i] = arrayToBeCopied[i];
		}
		System.out.println(Arrays.toString(arrayCopyPlace));
		scanner.close();
	}

}
