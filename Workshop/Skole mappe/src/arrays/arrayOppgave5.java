package arrays;

import java.util.Arrays;
import java.util.Random;

public class arrayOppgave5 {

	public static void main(String[] args) {
		Random rand = new Random();
		
		int[] valuesTakenIn = new int[10];

		for(int i=0; i < valuesTakenIn.length; i++){
			int randomNumbers = rand.nextInt(100)+1;
			valuesTakenIn[i] = randomNumbers;
		}
		
		int biggestNumber=valuesTakenIn[0];
		for (int i = 0; i < valuesTakenIn.length; i++) {
			if (biggestNumber < valuesTakenIn[i]){
				biggestNumber = valuesTakenIn[i];
			}
			

			
		}
		System.out.println(Arrays.toString(valuesTakenIn) + "and the higest number is: " + biggestNumber );
	}
}