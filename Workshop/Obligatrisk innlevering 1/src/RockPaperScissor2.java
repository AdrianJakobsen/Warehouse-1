import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int compute = rand.nextInt(3)+1;

		System.out.println("scissor(1), rock (2), paper (3): ");

		int answer = input.nextInt();
		input.close();

		String computegot=null;
		switch(compute){
		case 1: 
			computegot = "scissor";
			break;
		case 2: 
			computegot = "rock";
			break;
		case 3: 
			computegot = "paper";
			break;
		}

		String Userinput=null;
		switch(answer){
		case 1:
			Userinput = "scissor";
			break;
		case 2:
			Userinput = "rock";
			break;
		case 3:
			Userinput = "paper";
			break;
		default:
			 System.out.println("Please enter 1, 2 or 3");
			break;
		}

		int wld = compute-answer;
		String winLoseDraw = "initialize";
		switch(wld	){
		case -2:
		case 1:
			winLoseDraw = "Win!!!";
			break;
		case -1:
		case 2:
			winLoseDraw = "lose :(";
			break;
		case 0:
			winLoseDraw = "Draw";
			break;
		}

		String result = String.format("Compute is %s. You picked %s. It is a %s.", computegot, Userinput, winLoseDraw);
		System.out.println(result);
	}

}