package krishu.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import krishu.analyzer.GameProcessor;
import krishu.model.GameDetail;

@RestController
@RequestMapping("api/")
public class GameController {

	@RequestMapping(value = "games", method = RequestMethod.GET)
	public List<GameDetail> list() {
		
		GameProcessor gp = new GameProcessor();
		ArrayList<GameDetail> GameDetails = gp.process();
		
		return GameDetails;
	}
}
