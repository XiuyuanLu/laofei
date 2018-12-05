package person.laofei.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import person.laofei.web.WebConstants;

@RestController
public class HomeController {

	@RequestMapping("home")
	public ModelAndView home() {
		return new ModelAndView(WebConstants.HOME_PAGE);
	}
	
}
