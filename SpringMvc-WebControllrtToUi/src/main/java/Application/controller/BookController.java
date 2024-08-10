package Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BookController {

	
	@GetMapping("/bookdata")
	public String GetBookData(Model model) {
		model.addAttribute("name","sp");
		model.addAttribute("author","dev");
		model.addAttribute("price",100);
		return "book-data";
		
		
	}
}
