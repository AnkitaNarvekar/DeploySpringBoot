package com.example.demospring.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


import com.example.demospring.entity.Alien;
import com.example.demospring.repo.AlienRepo;
//import com.simplilearn.entity.Product;


@Controller
public class addController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")
	public String home()
	{
		return "home";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien)
	{
		repo.save(alien);
		return "home";
		
	}
	
	@RequestMapping("/getAlien")
	public ModelAndView getAlien(@RequestParam int aid)
	{
		ModelAndView mv=new ModelAndView("displayid");
		Alien alien= repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	
	/*
	 * @RequestMapping("/getAlienTech") public ModelAndView
	 * getAlienTech(@RequestParam String tech) { ModelAndView mv =new
	 * ModelAndView("displayByTeach"); Alien alien=repo.findByTech(tech);
	 * mv.addObject(alien); return mv; }
	 */
	/*
	 * @RequestMapping("/getAlienTech") public ModelAndView
	 * getAlienTech(@RequestParam String tech) { ModelAndView mv=new
	 * ModelAndView("displayByTech"); String alien= repo.findByTech(tech);
	 * mv.addObject(alien); return mv; //return "displayByTech"; }
	 */
	
	
	
	  @RequestMapping("/getAlienTech/{tech}")
	  
	  @ResponseBody public String getAlienTech(@PathVariable("tech") String tech) {
	  return repo.findByTech(tech);
	  
	  }
	 
	 
	
	  
	
		
		  @RequestMapping("/aliens")
		  
		  @ResponseBody public String getAlienAll() 
		  { 
			  return repo.findAll().toString();
		  }
		 

}
