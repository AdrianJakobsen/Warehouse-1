package arrays;

import java.util.Scanner;

public class start {

	public static void main(String[] args) {

		String [] months = new String[]{"Januar", "februar", "Mars", "April", "Mai", "Juni", "juli", "August", "September", "october", "November", "desember"};


		Scanner scanner = new Scanner(System.in);

		while(true){
			System.out.println("Input a number between 1 and " + (months.length));

			int index = scanner.nextInt()-1;
			scanner.close();

			if (index >= 0 && index < months.length){
				System.out.println(months[index]);
			}else{
				System.out.println("wrong input!");
			}



			/*for (int i=months.length-1; i >= 0; i--){//g�r gjennom array baklengs
			System.out.println(months[i]);
		}
		for (int i=0; i < months.length; i++){//g�r gjenomm en array fra start til slutt
			System.out.println(months[i]);
		}//itterere gjennom en array
			 */
		}
	}
}
