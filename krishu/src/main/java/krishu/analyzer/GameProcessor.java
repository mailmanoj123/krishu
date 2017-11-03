package krishu.analyzer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import krishu.db.DbStub;
import krishu.model.Batting;
import krishu.model.GameBattingHistory;
import krishu.model.GameDetail;
import krishu.model.NumberDetail;

public class GameProcessor {
	
	public ArrayList<GameDetail> process()
	{
		ArrayList<GameBattingHistory> allBattingsPerGame = DbStub.AllBattingPerGame;
		
		ArrayList<GameDetail> GameDetails =  meargeAllBatting(allBattingsPerGame);
		return GameDetails;
	}
	
	private ArrayList<GameDetail> meargeAllBatting(ArrayList<GameBattingHistory> allBattingsPerGame){
		
		ArrayList<GameDetail> GameDetails =  new ArrayList<GameDetail>();
		
		for (GameBattingHistory gameBattingHistory : allBattingsPerGame) {
			meargeAllNumbers(gameBattingHistory, GameDetails);
		}
		return GameDetails;
	}

	private void meargeAllNumbers(GameBattingHistory gameBattingHistory, ArrayList<GameDetail> GameDetails) {
		
		Integer gameId = gameBattingHistory.getGameId();
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(Batting batting : gameBattingHistory.getBattingHistory()) {
			for(Integer number : batting.BattingDetails) {
				numbers.add(number);
			}			
		}
		
		Map<Integer, Integer> numberMap = analysisBatting(numbers);
		ArrayList<NumberDetail> numberDetails = new ArrayList<NumberDetail>();
		
		for(Integer number : numberMap.keySet()) {
			
			NumberDetail numberDetail = new NumberDetail(number, numberMap.get(number), numbers.size());
			numberDetails.add(numberDetail);
			
		}
		GameDetails.add(new GameDetail(gameId, numberDetails));
	}
	
	public static Map<Integer, Integer> analysisBatting(ArrayList<Integer> numbers)
	{
		Map<Integer, Integer> retVal = new HashMap<Integer, Integer>();
		
		for(Integer number : numbers)
		{
			if(retVal.containsKey(number))
			{
				Integer count = retVal.get(number);
				count = count + 1;
				retVal.put(number, count);
			}
			else
			{
				retVal.put(number, 1);
			}
		}		
		return retVal;		
	}

}
