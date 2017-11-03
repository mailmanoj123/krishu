package krishu.model;

import java.util.ArrayList;

public class TerminalBattingHistory {
	
	Integer TerrminalId;
	ArrayList<Batting> BattingHistory = new ArrayList<Batting>();
	
	public Integer getTerrminalId() {
		return TerrminalId;
	}
	public void setTerrminalId(Integer terrminalId) {
		this.TerrminalId = terrminalId;
	}
	public ArrayList<Batting> getBattingHistory() {
		return BattingHistory;
	}
	
	/*public void setBattingHistory(ArrayList<Batting> battingHistory) {
		this.battingHistory = battingHistory;
	}*/
	
	public void addNewBatting(Integer terrminalId, Batting batting) {
		if(this.TerrminalId == terrminalId) {
			this.BattingHistory.add(batting);
		}
	}
	public TerminalBattingHistory(Integer terrminalId, ArrayList<Batting> battingHistory) {
		super();
		TerrminalId = terrminalId;
		BattingHistory = battingHistory;
	}

}
