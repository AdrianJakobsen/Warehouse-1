import java.util.Scanner;


public class SimpleMathLearningTool {
	public static void main(String[] args) {
		System.out.println("Write a number below 2147483647  \n\n");
		Scanner input = new Scanner (System.in);
		boolean exit = false;
		while (!exit) {
			int first = (int) (Math.random()*10);
			int second = (int) (Math.random()*10);
			
			System.out.println("What is " + first + "+ " + second + "? \n" );

			int answer = input.nextInt();
			
			boolean ok = ((first+second)==answer);
			
			if (ok){
				System.out.println("CORRECT!!!!!");
				break;
				
			}
			else{
				System.out.println("Wrong answer. Correct answer is: " + (first+second));
			}	
		}
		input.close();
	}

}