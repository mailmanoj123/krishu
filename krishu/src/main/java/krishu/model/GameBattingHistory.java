package krishu.model;

import java.util.ArrayList;

public class GameBattingHistory {
	
	Integer GameId;
	ArrayList<Batting> BattingHistory = new ArrayList<Batting>();
	public Integer getGameId() {
		return GameId;
	}
	public void setGameId(Integer gameId) {
		this.GameId = gameId;
	}
	public ArrayList<Batting> getBattingHistory() {
		return BattingHistory;
	}
	
	/*public void setBattingHistory(ArrayList<Batting> battingHistory) {
		this.battingHistory = battingHistory;
	}*/
	
	public void addNewBatting(Batting batting) {
		this.BattingHistory.add(batting);
	}
	
	public void addNewBatting(Integer gameId, Batting batting) {
		if(this.GameId == gameId) {
			this.BattingHistory.add(batting);
		}
	}
	public GameBattingHistory(Integer gameId, ArrayList<Batting> battingHistory) {
		super();
		GameId = gameId;
		BattingHistory = battingHistory;
	}
}
