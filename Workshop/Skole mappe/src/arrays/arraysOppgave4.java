package arrays;

import java.util.Arrays;
import java.util.Random;

public class arraysOppgave4 {

	public static void main(String[] args) {
		Random rand = new Random();


		int[] valuesTakenIn = new int[10];

		for(int i=0; i<=9; i++){
			int randomNumbers = rand.nextInt(100)+1;
			valuesTakenIn[i] = randomNumbers;
		}

		int sum = 0;
		for(int j : valuesTakenIn)
			sum += j;
			System.out.println(Arrays.toString(valuesTakenIn) + "\nSum:" + sum);


	}

}