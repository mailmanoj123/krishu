package krishu.db;

import java.util.ArrayList;

import krishu.model.Batting;

public class DbStubTest {

	public static void main(String[] args) {
		
		ArrayList<Batting> allBattings = DbStub.AllBattings;
		
		System.out.println(allBattings);

	}

}
