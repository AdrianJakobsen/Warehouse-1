import java.util.Scanner;

public class TtcGameEngine {

	private char player;
	private Scanner scanner; 
	private TtcBoard map;

	public TtcGameEngine(){
		map = new TtcBoard(3,3);
		scanner = new Scanner(System.in);
		player = 'X';
	}

	public void checkTurn(){
		player = (player=='O') ? 'X' : 'O';
	}
	public void win(){
		if(checkForWinner()== true){
			System.out.println("We have a winner");
			System.exit(0);
		}
	}
	public void draw(){
		System.out.println("DRAW");
		System.exit(0);
	}
	public void newBoard(){
		map.printMap();
	}
	public char getCurrentPlayer(){
		return this.player;
	}
	public void requestMove(){
		boolean validInput = false;
		do{
			if(player == 'O'){
				System.out.println("Player 1, please enter row and column (0, 1 or 2): ");
			}
			else { 
				System.out.println("Player 2, plese enter row and column (0, 1 or 2): ");
			}
			int row =scanner.nextInt();
			int column = scanner.nextInt();
			if(map.put(row, column, player)==true){
				map.getMap()[row][column] = player;
				validInput = true;
			}
			else{System.out.println("This move at (" + (row) + "," + (column)     + ") is not valid. Try again...");
			}
		}
		while (!validInput);  
	}
	public boolean checkForWinner(){
		return (checkRowWinner() || checkColumnWinner() || checkDiagonalsForWin()== true);	
	}	
	private boolean checkRowWinner(){
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(map.getMap()[i][0], map.getMap()[i][1], map.getMap()[i][2]) == true) {
				return true;
			}
		}
		return false;
	}
	private boolean checkColumnWinner(){
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(map.getMap()[0][i], map.getMap()[1][i], map.getMap()[2][i]) == true) {
				return true;
			}
		}
		return false;
	}
	private boolean checkDiagonalsForWin() {
		return ((checkRowCol(map.getMap()[0][0], map.getMap()[1][1], map.getMap()[2][2]) == true) 
				|| (checkRowCol(map.getMap()[0][2], map.getMap()[1][1], map.getMap()[2][0]) == true));
	}
	private boolean checkRowCol(char firstChar, char secondChar, char thirdChar) {
		return ((firstChar != 0) && (secondChar == firstChar) && (secondChar == thirdChar));
	}
}