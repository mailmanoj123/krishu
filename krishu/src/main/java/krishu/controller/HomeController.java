package krishu.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	public String index() {
		return "index.html";
	}
}
