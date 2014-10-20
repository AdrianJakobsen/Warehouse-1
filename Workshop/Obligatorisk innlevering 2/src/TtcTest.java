
public class TtcTest {

	public static void main(String[] args) {
		TtcGameEngine engine = new TtcGameEngine();
		boolean gameInProgress = true;
		int remainingTurns = 9;	
		engine.newBoard();
		
		while(gameInProgress != false){
			engine.checkTurn(engine.currentPlayer);
			engine.requestMove(engine.currentPlayer);
			if(engine.checkForWinner()==true){
				engine.win();
			}
			engine.newBoard();
			 remainingTurns--;
			 if(remainingTurns==0){
				 engine.draw();
			 }
		}
	}
}