
import java.util.Arrays;
import java.util.Scanner;


public class Sortere3Tall {
	public static void main (String [] args) {
		Scanner input = new Scanner (System.in);

		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		input.close();
		int number [] = {num1,num2,num3};
		int temp; //hva er dette for???
		boolean correct = false;

		while (correct == false){
			correct = true;
			for (int i = 0; i<number.length-1; i++){
				if (number [i] > number [i]+1){
					temp = number [i+1];
					number [i+1] = number[i];
					number[i]= temp;
					correct = false;

				}
			}
		}
		Arrays.sort(number);
		for(int i = 0; i<number.length; i++){
			System.out.println(number[i]);
		}
	}

}
