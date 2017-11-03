package krishu.db;

import java.util.ArrayList;
import java.util.Map;

import krishu.model.Batting;
import krishu.model.GameBattingHistory;
import krishu.model.TerminalBattingHistory;

public class DbStub {
	
	static {
		AllBattingNumbers = new ArrayList<Integer>();
		AllBattings = new ArrayList<Batting>();
		AllBattingPerGame = new ArrayList<GameBattingHistory>();
		BattingOfTerminals = new ArrayList<TerminalBattingHistory>();
		generateDbData();
	}

	private static int PreviousBattingSequenceId = 0;
	
	public static int getNextSequenceId()
	{
		return (++PreviousBattingSequenceId);
	}
	
	public static ArrayList<Integer> AllBattingNumbers;
	
	public static ArrayList<Batting> AllBattings;
	
	public static ArrayList<GameBattingHistory> AllBattingPerGame;
	
	
	public static ArrayList<TerminalBattingHistory> BattingOfTerminals;

	public static void generateDbData() {
		generateGameData();
	}

	private static void generateGameData() {

		int gameCount = 20;
		int terminalCount = 20;
		int battingCount = 20;

		for(int i = 0; i < gameCount ; i++) {
			generateTerminalData(i, terminalCount, battingCount);
			// ArrayList<Batting> battingPerGame = new ArrayList<Batting>();			
		}

		// BattingOfTerminals


		for(Integer terminalId = 0; terminalId < terminalCount; terminalId++) {

			ArrayList<Batting> battingPerTerminal = new ArrayList<Batting>();

			for(Batting batting : AllBattings) {

				if(terminalId == batting.TerminalId) {						
					battingPerTerminal.add(batting);
				}					
			}
			BattingOfTerminals.add(new TerminalBattingHistory(terminalId, battingPerTerminal));
		}
	}

	private static void generateTerminalData(Integer gameId, int terminalCount, int battingCount) {
		
		ArrayList<Batting> battingPerGame = new ArrayList<Batting>();

		for (int terminalId = 0; terminalId < terminalCount; terminalId++) 
		{
			
			// generate batting per terminal.
			ArrayList<Integer> battingNumbers = generateBattingData(battingCount);
			int nextSequenceId = getNextSequenceId();
			Batting batting = new Batting(gameId, terminalId, nextSequenceId, battingNumbers);
			
			AllBattings.add(batting);
			battingPerGame.add(batting);
			
		}
		AllBattingPerGame.add(new GameBattingHistory(gameId, battingPerGame));
	}

	private static ArrayList<Integer> generateBattingData(int battingCount) {

		ArrayList<Integer> retVal = new ArrayList<Integer>();

		for (int i = 0; i < battingCount; i++) {
			int randomNum = 0 + (int) (Math.random() * 10);
			retVal.add(randomNum);
			AllBattingNumbers.add(randomNum);
		}
		return retVal;
	}

}
