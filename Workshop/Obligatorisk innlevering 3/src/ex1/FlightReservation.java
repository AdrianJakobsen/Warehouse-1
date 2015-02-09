package ex1;

import java.util.Scanner;

public class FlightReservation {
	private int totalReservdSeats;
	private final int ROWS;
	private final int SEATS;
	private char[][]seatArray;
	private Scanner scan;

	public FlightReservation(){
		ROWS = 9;
		SEATS = 6;
		seatArray = new char[ROWS][SEATS];
		totalReservdSeats=0;
		settUpArray(ROWS, SEATS);
		scan = new Scanner(System.in);
	}
	public double prosentBookedSeats(){
		double prosentBookedSeats = totalReservdSeats/(ROWS*SEATS);
		return prosentBookedSeats;
	}
	public void show(){
		for(int i=0; i<seatArray.length; i++){
			System.out.println();
			System.out.print(i+1);
			System.out.print(" ");
			for (int j=0; j<seatArray[i].length; j++){
				System.out.print(seatArray[i][j] + " ");
			} 
		}
	}
	public void assignSeat(int chosenRow, char seat){
		int seatIndex = seat-'A';
		if(rowOk(chosenRow) && seatOk(seat)){
			seatArray[chosenRow-1][seatIndex]  = 'X';
			totalReservdSeats++;
		}
		else{
			System.out.println("Ikke tiljengelig");
		}
	}
	public int inputedRow(){
		System.out.println("\nEnter row number: ");
		int chosenRow=scan.nextInt();
		return chosenRow;
	}
	public char inputedSeat(){
		System.out.println("Enter Seat A B C D E or F:  ");
		char seat=scan.next().charAt(0);
		return seat;
	}
	private boolean rowOk(int chosenRow){
		if(chosenRow > ROWS || chosenRow < 0){
			System.out.println("invalid command input. Try again.");
			return false;
		}
		else{
			return true;
		}
	}
	private boolean seatOk(char seat){	
		if(seat >= 'A' && seat <= (SEATS+'A')){ 
			return true;
		}
		System.out.println("invalid command input. Try again.");
		return false;
	}	
	public void settUpArray(int ROWS, int SEATS){
		for(int i=0; i<ROWS; i++){
			char charSetup = 'A';
			for(int j=0 ; j<SEATS; j++){
				seatArray[i][j] = charSetup++;
			}
		}
	}
}