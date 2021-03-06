
public class TtcBoard {
	public static final Object[][] getMap = null;
	private char[][] mapMatrix;
	

	public TtcBoard(int xValue, int yValue){
		mapMatrix = new char[xValue][yValue];
	}
	public char[][] getMap(){
		return mapMatrix;		
	}
	public boolean put(int rowValue, int columnValue, char symbol) {		
		if(rowValue>=mapMatrix.length 
				|| columnValue>=mapMatrix[rowValue].length 
				|| rowValue < 0 || columnValue < 0
				|| mapMatrix[rowValue][columnValue] == 'X' 
				|| mapMatrix[rowValue][columnValue] == 'O'){
			return false;
		}
		return true;	
	}
	void printMap(){
		for(int row = 0 ; row<mapMatrix.length; row++){
			for(int column = 0; column<mapMatrix[row].length; column++) {
				System.out.print("[" + mapMatrix[row][column] + "]");
			}
			System.out.println();
		}
	}
}