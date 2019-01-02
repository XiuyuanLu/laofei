package person.laofei.web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import person.laofei.web.WebConstants;

@RestController
public class PageController {

	@RequestMapping("home")
	public ModelAndView home() {
		return new ModelAndView(WebConstants.PAGE_HOME);
	}
	
	@RequestMapping("product")
	public ModelAndView product() {
		return new ModelAndView(WebConstants.PAGE_PRODUCT);
	}
	
	@RequestMapping("reading")
	public ModelAndView reading() {
		return new ModelAndView(WebConstants.PAGE_READING);
	}
	
	@RequestMapping("tools")
	public ModelAndView tools() {
		return new ModelAndView(WebConstants.PAGE_TOOLS);
	}
}
