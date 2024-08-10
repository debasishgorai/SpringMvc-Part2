package Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Application.pojo.Plan;
@Controller
public class InsurancePlanConroller {
	@GetMapping("/plandata")
	@ResponseBody
public Plan getPlanData() {
	Plan p=new Plan();
	p.setPlanName("jeevan anand");
	p.setPlanId(2);
p.setPlanStatus("aproved");
	
	return p;
}
}
