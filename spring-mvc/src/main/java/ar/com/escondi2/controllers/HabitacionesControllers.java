package ar.com.escondi2.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HabitacionesControllers {
	
	@GetMapping("/habitaciones")
	public String habitaciones() {
		//quiero ir a la pag. home.html
		return "habitaciones";
	}

	
}
	
