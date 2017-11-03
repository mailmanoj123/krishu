package krishu.model;

import java.util.ArrayList;

public class Terminal  implements Comparable<Terminal> {
	
	public int TerminalId;
	//public String TerminalName;
	public int currentRatio;
	public int TotalWinning;
	public int TotalBatting;
	public ArrayList<Batting> PreviousBattings = new ArrayList<Batting>(); 
	public Batting CurrentBatting;
	
	
	
	public Terminal(int terminalId, Batting currentBatting) {
		super();
		TerminalId = terminalId;
		CurrentBatting = currentBatting;
	}



	public int compareTo(Terminal compareTerminal) {
		
		int compareCurrentRatio = ((Terminal) compareTerminal).currentRatio;

		//ascending order
		return this.currentRatio - compareCurrentRatio;

		//descending order
		//return compareCurrentRatio - this.currentRatio;
	}
	
}