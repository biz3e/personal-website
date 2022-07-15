package dev.benzhou.personalPortfolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class NavigationController {

	@RequestMapping(value = { "home", "", "/" })
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("index");

		return mv;
	}

	@RequestMapping(value = { "quickroute", "/quickroute" })
	public ModelAndView quickRoute() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("quickroute");

		return mv;
	}

	@RequestMapping(value = { "mazegame", "/mazegame" })
	public ModelAndView mazeGame() {
		ModelAndView mv = new ModelAndView();

		mv.setViewName("mazegame");

		return mv;
	}

}
