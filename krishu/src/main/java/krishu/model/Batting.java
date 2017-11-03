package krishu.model;

import java.util.ArrayList;

public class Batting {
	
	// sequence counter.
	//public static int PreviousSequenceId;
	
	public int GameId;
	public int TerminalId;
	public int BattingSequenceId;
	public ArrayList<Integer> BattingDetails;
	
	public int totalBattingAmmount;	
	public int WinningNumber;
	public int winningAmount;
	

	public Batting(int gameId, int terminalId, int battingSequenceId, ArrayList<Integer> battingDetails) {
		super();
		GameId = gameId;
		TerminalId = terminalId;
		BattingSequenceId = battingSequenceId;
		BattingDetails = battingDetails;
	}

/*	public Batting(int gameId2, int i, ArrayList<Integer> battingDetail) {
		// TODO Auto-generated constructor stub
	}*/

	public int getTotalBattingAmmount() {
		
		if(BattingDetails !=  null && BattingDetails.size() > 0)
		{
			return BattingDetails.size();
		}
		else
		{
			return 0;
		}
	}
	
	
}
