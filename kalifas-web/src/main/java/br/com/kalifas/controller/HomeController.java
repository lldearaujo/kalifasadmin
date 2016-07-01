package br.com.kalifas.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
//	@RequestMapping(value="/", method=RequestMethod.GET)
//	public String index(){
//		System.out.println("passou aqui!");
//		return "hello";
//	}
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView modelAndView = new ModelAndView("login");
//		modelAndView.addObject("types", BookType.values());
		return modelAndView;
	}

}
