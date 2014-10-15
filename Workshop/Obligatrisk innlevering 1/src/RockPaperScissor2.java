import java.util.Random;
import java.util.Scanner;

public class RockPaperScissor2 {

	public static void main(String[] args) {
		print("scissor(1), rock (2), paper (3): ");

		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();
		input.close();

		Random rand = new Random();
		int compute = rand.nextInt(3)+1;

		String computerString = valueToString(compute);
		String userString = valueToString(answer);
		String result = decider(compute, answer);
		
		String format = String.format("Computer got %s. You got %s. It is a %s.",computerString, userString, result);
		print(format);
	}
	
	public static void print(String s) {
		System.out.println(s);
	}

	public static String valueToString(int value) {
		String result ="";

		switch(value){
		case 1: 
			result = "scissor";
			break;
		case 2: 
			result = "rock";
			break;
		case 3: 
			result = "paper";
			break;
		default: 
			System.out.println("Wrong input!");
			System.exit(0);

		}
		return result;
	}

	public static String decider(int computer, int input){
		int wld = computer-input;
		String winLoseDraw = "initialize";
		switch(wld	){
		case -2:
		case 1:
			winLoseDraw = "Win!!!";
			break;
		case -1:
		case 2:
			winLoseDraw = "loss :(";
			break;
		case 0:
			winLoseDraw = "Draw";
			break;
		}
		return winLoseDraw;
	}
}