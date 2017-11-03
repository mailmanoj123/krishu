package krishu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import krishu.db.DbStub;
import krishu.model.Batting;

@RestController
@RequestMapping("api/")
public class BattingController {
	
	@RequestMapping(value = "batting", method = RequestMethod.GET)
	public List<Batting> list() {
		
		ArrayList<Batting> allBattings = DbStub.AllBattings;
		
		return allBattings;
	}
	
}
