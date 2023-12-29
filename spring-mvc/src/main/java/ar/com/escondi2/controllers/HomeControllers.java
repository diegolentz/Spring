package ar.com.escondi2.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
@Controller
public class HomeControllers {

	//GET > http://localhost:8080/
	@GetMapping(value = {"/","/home"})
	public String home(Model model) {
		//quiero ir  a la pagina home.html
		return "home";
	}
}