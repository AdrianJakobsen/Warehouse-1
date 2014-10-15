package arrays;

import java.util.Arrays;
import java.util.Random;

public class arraysOppgave3 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		
		int[] valuesTakenIn = new int[10];
		
		for(int i=0; i<=9; i++){
			int randomNumbers = rand.nextInt(100)+1;
			valuesTakenIn[i] = randomNumbers;
		}
		
		System.out.println(Arrays.toString(valuesTakenIn));
		

	}

}
