import java.util.Scanner;


public class GCD {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while(exit != true){
			int gcd = 1; //initial gcd
			int k = 2; //possible gcd values
			System.out.println("Please enter first number: ");
			int n1 = input.nextInt();
			System.out.println("Please enter second number: ");
			int n2 = input.nextInt();


			while(k<=n1 && k<=n2){
				if(n1 % k == 0 && n2 % k ==0)
					gcd=k; // update gcd
				k++;
			}
			System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + gcd);
		}
		input.close();
	}
}
