import java.util.Scanner;


public class TtcGameEngine {
	Scanner scanner = new Scanner(System.in);

	public char currentPlayer = 'X';
	TtcBoard map = new TtcBoard(3,3);

	public TtcGameEngine(){

	}
	void newBoard(){
		map.printMap();
	}
	public void requestMove(char currentPlayer){
		boolean validInput = false;

		do{
			if(currentPlayer == 'X'){
				System.out.println("Player 1, please enter row and column (0, 1 or 2): ");
			}
			else { 
				System.out.println("Player 2, plese enter row and column (0, 1 or 2): ");
			}
			int row =scanner.nextInt();
			int column = scanner.nextInt();
			if(map.put(row, column, currentPlayer)==false){
				map.getMap()[row][column] = currentPlayer;
			}
			System.out.println("This move at (" + (row) + "," + (column)     + ") is not valid. Try again...");
		}
		while (!validInput);  
	}
	private boolean checkRowCol(char X, char O, char empty) {
		return ((X != ' ') && (X == O) && (O == ' '));
	}
	private boolean checkRowWinner(){
		for (int i = 0; i < 3; i++) {
			if (checkRowCol(map.getMap()[i][0], map.getMap()[i][1], map.getMap()[i][2]) == true) {
				return true;
			}
		}
		return false;
	}
	private boolean checkcolumnWinner(){
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
	public boolean checkForWinner(){
		return (checkRowWinner() || checkcolumnWinner() || checkDiagonalsForWin());
	}
	public void checkTurn(char currentPlayer){
		if(currentPlayer=='O'){
			currentPlayer = 'X';
		}else{
			currentPlayer = 'O';
		}
	}
	public void win(){
		if(checkForWinner()== false){
			System.out.println("We have a winner");
			System.exit(0);
		}
	}
	public void draw(){
		System.out.println("DRAW");
		System.exit(0);
	}
}