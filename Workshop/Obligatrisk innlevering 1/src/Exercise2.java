import java.util.Scanner;


public class Exercise2 {
	public static void main(String[] args){
		Scanner input = new Scanner (System.in);
		System.out.println("please enter three numbers: ");
		double tall1 = input.nextDouble();
		double tall2 = input.nextDouble();
		double tall3 = input.nextDouble();
		input.close();
		
		double avarge = (tall1+tall2+tall3)/3;
		
		String result = String.format("%.2f", avarge);
		System.out.println("the avrage of " + tall1 +", " + tall2 +" and " + tall3 + " is: " +result);
		
	}

}
