package ar.com.escondi2.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PromocionesControllers {
	
	@GetMapping("/promociones")
	public String promociones() {
		//quiero ir a la pag. home.html
		return "promociones";
	}

	
}
	
