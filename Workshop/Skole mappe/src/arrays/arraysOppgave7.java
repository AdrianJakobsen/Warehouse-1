package arrays;

import java.util.Scanner;

public class arraysOppgave7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] arrayToBeSearched = new int[]{1,2,3,4,5,6,7,8};
		System.out.println(searchTheArray(arrayToBeSearched, 8));
		int input = scanner.nextInt();
		System.out.println(searchTheArray(arrayToBeSearched, input));
		scanner.close();
	}

	//itterasjon
	private static boolean searchTheArray(int [] array, int key){
		for (int i = 0; i < array.length; i++) {
			if (array[i]==key){
				return true;
			}	
		}
		return false;
	}
}
