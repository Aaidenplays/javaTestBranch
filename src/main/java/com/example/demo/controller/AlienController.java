package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Controller
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
	@RequestMapping("/")	
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/addAlien")
	public String addAlien(Alien alien) {
		System.out.println(alien);
		repo.save(alien);
		return "home.jsp";
	}
	
//	@RequestMapping("/getAlien")
//	public ModelAndView getAlien(@RequestParam Integer aid) {
//		ModelAndView mv = new ModelAndView("showAlien.jsp");
//		Alien alien = repo.findById(aid).orElse(new Alien());
//		
////		System.out.println(repo.findByTech("Java"));
////		System.out.println(repo.findByAidGreaterThan(aid));
////		System.out.println(repo.findByTechSorted("java"));
////		
//		mv.addObject(alien);
//		return mv;
//	}
	
	@RequestMapping(path="/aliens"/*, produces= {"application/xml"}*/)//will now only support XML  
	@ResponseBody
	public List<Alien> getAliens() {

//		return repo.findAll().toString();
		return repo.findAll();
		
	}
	
	@RequestMapping("/alien/{aid}")
	@ResponseBody
	public Optional<Alien> getAlien(@PathVariable("aid") Integer aid) {

//		return repo.findById(aid).toString();
		return repo.findById(aid);
		
	}
}
