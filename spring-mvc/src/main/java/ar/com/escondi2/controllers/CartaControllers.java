package ar.com.escondi2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class CartaControllers {
	
	@GetMapping("/carta")
	public String carta() {
		//quiero ir a la pag. home.html
		return "carta";
	}

	
}
	
