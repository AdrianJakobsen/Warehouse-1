import java.util.Scanner;


public class fuckingsotave {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int check = scan.nextInt();
		int a = check%2;
		int b = check%3;
		System.out.println(a); System.out.println(b);
		if((check%2)==0 ||  (check%3)==0){
			if ( ((check%2)==0) != ((check%3)==0)){
				System.out.println("true");
			}else{
				System.out.println("false1");
			}
		}
		else{
			System.out.println("false2");
		}


	}
}
