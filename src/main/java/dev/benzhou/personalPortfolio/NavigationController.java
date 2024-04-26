package dev.benzhou.personalPortfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavigationController {

	@RequestMapping(value = { "home", "", "/" }, method = RequestMethod.GET)
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");

		return mv;
	}

	@RequestMapping(value = { "quickroute", "/quickroute" }, method = RequestMethod.GET)
	public ModelAndView quickRoute() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("quickroute");

		return mv;
	}

	@RequestMapping(value = { "mazegame", "/mazegame" }, method = RequestMethod.GET)
	public ModelAndView mazeGame() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("mazegame");

		return mv;
	}

	@RequestMapping(value = { "thiswebsite", "/thiswebsite" }, method = RequestMethod.GET)
	public ModelAndView thisWebsite() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("thiswebsite");

		return mv;
	}

	@RequestMapping(value = { "about", "/about" }, method = RequestMethod.GET)
	public ModelAndView aboutMe() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("about");

		return mv;
	}

}
