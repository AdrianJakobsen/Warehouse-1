import java.util.Random;
import java.util.Scanner;

import com.sun.org.apache.bcel.internal.generic.BALOAD;


public class beanMachine {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Please enter the number of balls to play: ");
		int numberOfBalls = scanner.nextInt();
		System.out.println("Please enter the number of slots in the game:");
		int numberOfSlots = scanner.nextInt();


		char[][] main = allBallPathsInArrayForm(numberOfSlots, numberOfBalls);
		int[] ballPlacementArrayForm = ballPlacement(main, numberOfBalls, numberOfSlots);
		printMyArray(main, numberOfBalls, numberOfSlots);
		printBallPlacement(ballPlacementArrayForm);
	}
	public static char[][] allBallPathsInArrayForm(int numberOfSlots, int numberOfBalls){
		Random rand = new Random();
		char ballPathInchar = ' ';
		int ballPathInNumber = 0;
		char[][] pathOfBalls = new char[numberOfBalls][numberOfSlots];

		for(int row = 0; row<numberOfBalls; row++){
			for(int column = 0; column<numberOfSlots; column++){
				ballPathInNumber = rand.nextInt(2);
				if (ballPathInNumber == 1){
					ballPathInchar = 'L';
					pathOfBalls[row][column] = ballPathInchar;
				}
				else{
					ballPathInchar = 'R';
					pathOfBalls[row][column] = ballPathInchar;
				}
			}
		}
		return pathOfBalls;
	}

	public static void printMyArray(char[][] main, int numberOfBalls, int numberOfSlots){
		for (int row = 0; row < numberOfBalls; row++) {
			for (int column = 0; column < numberOfSlots;column++) {
				System.out.print(main[row][column] + "");
			}
			System.out.println();
		}
	}
	public static int[] ballPlacement(char[][] main, int numberOfBalls, int numberOfSlots){	
		int[] resultColumns = new int[numberOfBalls];
		for (int row = 0; row < numberOfBalls; row++) {
			int placement =0;
			for (int column = 0; column < numberOfSlots;column++) {
				if(main[row][column] == 'R'){
					placement++;
				}
			}
			resultColumns[row] = placement;
		}
		return resultColumns;
	}
	public static void printBallPlacement(int[] ballPlacement){
		int columns = 0;
		for(int i = 0; i<ballPlacement.length; i++){
			columns = (columns<ballPlacement[i]) ? ballPlacement[i] : columns;
		}
		char[][] ballPlacementMatrix =new char[ballPlacement.length][columns+1];
		for(int row = ballPlacement.length-1 ; row>=0; row--){
			for(int column = columns-1; column>=0; column--){
				ballPlacementMatrix[row][column]= ' ';
			}
		}
		int highestRow = 0;
		for(int ballNumber= 0; ballNumber<ballPlacement.length; ballNumber++){
			for(int row = 0; row<columns; row++){
				int ballColumn = ballPlacement[ballNumber];
				if(ballPlacementMatrix[row][ballColumn]==' '){
					ballPlacementMatrix[row][ballColumn]='O';
					highestRow = (highestRow<row) ? row : highestRow;
					break;
				}
			}
		}
		for(int row = highestRow ; row>=0; row--){
			for(int column = columns-1; column>=0; column--) {
				System.out.print(ballPlacementMatrix[row][column] + "");
			}
			System.out.println();
		}
	}
}