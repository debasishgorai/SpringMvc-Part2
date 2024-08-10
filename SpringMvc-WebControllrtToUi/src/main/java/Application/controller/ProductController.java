package Application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import Application.pojo.Product;
@Controller
public class ProductController {
	@GetMapping("/productdata")
	public ModelAndView getProductData() {
		ModelAndView mav= new ModelAndView();
	
		Product pro=new Product();
			
		pro.setProductId(01);
		pro.setProductName("laptip");
		pro.setProductPrice(62000.00);
		mav.addObject("product",pro);
		mav.setViewName("product-data");
		
		
		
		
		
		
		
		
		return mav;
}
}