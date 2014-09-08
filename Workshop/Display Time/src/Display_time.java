import java.util.Scanner;


public class Display_time {

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.println ("Enter seconds:");
		int numberOfSeconds = input.nextInt();
		int minute = (numberOfSeconds / 60);
		int seconds = (numberOfSeconds % 60);
		
		System.out.println(minute + "min" + seconds + "sec");
	}

}
