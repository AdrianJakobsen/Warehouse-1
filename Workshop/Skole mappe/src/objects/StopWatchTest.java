package objects;

import java.util.Scanner;

public class StopWatchTest {

	public static void main(String[] args) {
		StopWatch stopWatch = new StopWatch();
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("Please press enter to start.");
			scanner.nextLine();
			stopWatch.start();
			System.out.println("Running.....");
			System.out.println("Press enter to stop");
			scanner.nextLine();
			stopWatch.stop();
			System.out.println("Elapsed time in s: " + stopWatch.getElapsedTime());
			stopWatch.reset();
		}
	}
	
}
