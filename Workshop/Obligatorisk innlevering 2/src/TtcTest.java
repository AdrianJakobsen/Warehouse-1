
public class TtcTest {

	public static void main(String[] args) {
		TtcGameEngine engine = new TtcGameEngine();
		boolean gameInProgress = true;
		int remainingTurns = 9;	
		
		do{
			engine.newBoard();
			engine.checkTurn();
			engine.requestMove();
			if(engine.checkForWinner()==true){
				engine.newBoard();
				engine.win();
			}
			remainingTurns--;
			if(remainingTurns==0){
				engine.newBoard();
				engine.draw();	
			}
		}while(gameInProgress != false);
	}
}