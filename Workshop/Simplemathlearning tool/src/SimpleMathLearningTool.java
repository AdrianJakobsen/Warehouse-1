import java.util.Scanner;


public class SimpleMathLearningTool {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		int first = (int) (Math.random()*10);
		int second = (int) (Math.random()*10);
		
				System.out.println("What is " + first + "+ " + second + "? \n" );
		int answer = input.nextInt();
		boolean ok = ((first+second)==answer);
		if (ok){
			System.out.println("CORRECT!!!!!");
	}
		else{
			System.out.println("Try again");
		}	
	}

}
