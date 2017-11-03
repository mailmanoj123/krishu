package krishu.model;

import java.util.ArrayList;

public class GameDetail {
	
	private Integer GameId;
	private ArrayList<NumberDetail> Numbers;
	
	public GameDetail(Integer gameId, ArrayList<NumberDetail> numbers) {
		super();
		GameId = gameId;
		Numbers = numbers;
	}
	public Integer getGameId() {
		return GameId;
	}
	public ArrayList<NumberDetail> getNumbers() {
		return Numbers;
	}
	
}
