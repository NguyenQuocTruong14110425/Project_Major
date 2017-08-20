package controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class appController {
    @GetMapping(value={"/","/home"})
	public String Home(ModelMap model) {
		return "e_shopper/home";
	}
    @GetMapping(value={"detail"})
  	public String detail(ModelMap model) {
  		return "home_shopper/detail";
  	}
}
