import java.util.Scanner;


public class Gcdmulti {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean exit = false;
		while(exit != true){

			System.out.println("Please enter first number: ");
			int n1 = input.nextInt();
			System.out.println("Please enter second number: ");
			int n2 = input.nextInt();
			input.close();

			int d;

			if (n1<n2){
				d = n1;

			}
			else {
				d=n2;
			}
			for (int i= d; i>0; i--){
				if( n1 % i == 0 && n2 % i == 0){
					System.out.println("The GCD of " + n1 + " and " + n2 + " is: " + i);;

				}
			}

		} 
	}

}

