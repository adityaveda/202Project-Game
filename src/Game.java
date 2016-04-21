
public class Game {

	GameStatus status;
	GameStatus startstate;
	GameStatus progressState;
	GameStatus stopstate;
	
	public static Game game;
	
	private Game(){
		
		startstate = new GameStart();
		progressState = new GameInProgress();
		stopstate = new GameStop();
		status = stopstate;
	}
	
	public static Game getGameInstance(){
		if(game == null)
			game = new Game();
		return game;
	}
	
	public void setState(GameStatus status){
		this.status = status;
	}
}
