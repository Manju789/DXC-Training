package com.dxc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dxc.beans.Athlete;
import com.dxc.repository.AthleteRepository;

@Controller
public class AthleteController {
	
	@Autowired
	AthleteRepository repo;
	
	@RequestMapping("/")
	public String display() {
		return "index";
	}
	
	@RequestMapping("/index")
	public String displayIndex() {
		return "index";
	}
	
	@RequestMapping("/add")
	public ModelAndView displayForm() {
		return new ModelAndView("add", "command", new Athlete());
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView saveDetails(@ModelAttribute("athlete") Athlete athlete) {
		repo.addAthlete(athlete);
		return new ModelAndView("redirect:/view");
	}
	
	@RequestMapping("/view")
	public ModelAndView viewDetails() {
		return new ModelAndView("view", "list", repo.getAthlete());
	}
}
