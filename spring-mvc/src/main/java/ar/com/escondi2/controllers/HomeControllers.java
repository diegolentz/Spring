package ar.com.escondi2.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeControllers {
	
	@GetMapping(value = "/")
	public String home() {
		//quiero ir a la pag. home.html
		return "home";
	}
}
