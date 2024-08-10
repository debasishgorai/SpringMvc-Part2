package SpringBootApplication.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import SpringBootApplication.bindings.Product;

@Controller
public class ProductController {
	
	@GetMapping("/loadForm")
public String loadForm(Model model) {
	Product p=new Product();
	p.setProductId(11);
	p.setProductName("laptop");
	p.setProductPrice(220000.00);
	
	
	model.addAttribute("product",p);
	
	return "index";
	
}
	@GetMapping("/saveproduct")
	public String Handle(Product product,Model model) {
		System.out.println(product);
		model.addAttribute("msg","amt bokachoda");
		return "dashboard";
		
	}
}
