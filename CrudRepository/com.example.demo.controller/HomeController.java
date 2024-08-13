package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;
import com.example.demo.service.UpdatedData;

import jakarta.servlet.http.HttpServletRequest;

@Controller
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
	
	@RequestMapping("/addAlien")
	public String home(Alien alien)
	{
		repo.save(alien);
		return "home.jsp";
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
}
