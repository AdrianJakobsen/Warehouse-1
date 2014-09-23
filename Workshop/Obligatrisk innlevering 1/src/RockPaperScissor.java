import java.util.Random;
import java.util.Scanner;


public class RockPaperScissor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();

		int compute = rand.nextInt(3)+1;

		System.out.println("scissor(1), rock (2), paper (3): ");

		int answer = input.nextInt();
		input.close();

		if(answer==1 && compute==1){
			System.out.println("Computer picks scissor. You pick scissor. It is a draw.");
		}else if(answer==1 && compute==2){
			System.out.println("Computer picks rock. You pick scissor. You lose.");
		}else if(answer==1 && compute==3){
			System.out.println("Computer picks paper. You pick scissor. You WIN!!!!");
		}else if(answer==2 && compute==1){
			System.out.println("Computer picks scissor. you pick rock. You WIN!!!");
		}else if(answer==2 && compute==2){
			System.out.println("Computer picks rock. You pick rock. It is a draw.");
		}else if(answer==2 && compute==3){
			System.out.println("Computer picks paper. You pick rock. You lose.");
		}else if (answer==3 && compute==1){
			System.out.println("Computer picks scissor. You pick paper. You lose.");
		}else if (answer==3 && compute==2){
			System.out.println("Computer picks rock. You pick paper. You WIN!!!");
		}else if(answer==3 && compute==3){
			System.out.println("Computer picks paper. You pick paper. It is a draw.");
		}
	}
}		