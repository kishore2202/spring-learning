package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import com.example.demo.service.UpdatedData;

import jakarta.servlet.http.HttpServletRequest;

@RestController
public class HomeController {
	
	@Autowired
	AlienRepo repo;
	UpdatedData data;
	
	@Autowired
	public HomeController(UpdatedData data) {
        this.data = data;
    }
	
	@RequestMapping("/")
	public String home()
	{
		return "home.jsp";
	}
	
	
	@PostMapping(path="/alien", consumes=("application/json"))
	
	public Alien home(@RequestBody Alien alien)
	{
		repo.save(alien);
		return alien;
	}
	
	@RequestMapping("/readAlien")
	public ModelAndView readAlien(int aid, String aname)
	{
		ModelAndView mv=new ModelAndView("readAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping("/deleteAlien")
	public String deleteAlien(int aid)
	{
		repo.deleteById(aid);
		return "home.jsp";
	}
	
	@GetMapping("/update")
	public String updateData(HttpServletRequest req, int aid)
	{
		String name=req.getParameter("name");
		String lang=req.getParameter("lang");
		data.updateData(aid, name, lang);
		return "home.jsp";
	}
	
	@RequestMapping(path="/aliens", produces= {"application/json"})
	public List<Alien> getAliens()
	{
		return repo.findAll();
	}
	@RequestMapping(path="/aliens/{aid}", produces= {"application/json"})
	public Optional<Alien> getAlien(@PathVariable("aid") int aid)
	{
		return repo.findById(aid);
	}
	
}
