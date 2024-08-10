package SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import SpringBootApplication.bindings.User;

//import ch.qos.logback.core.model.Model;

@Controller
public class UserController {

	
	@GetMapping("/user-form")
	public String loadUserForm(Model model) {
		User user=new User();
		model.addAttribute("user", user);
		
		return "index";
		
	}
	@PostMapping("/saveUser")
	public String saveUser(User user,BindingResult bs,Model model) {
		if(bs.hasErrors()) {
			return "index";
		}
		System.out.println(user);
		model.addAttribute("msg","succesfully saved");
		
		
		return "dashboard";
	}
	
}
