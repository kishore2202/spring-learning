package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@Service
public class UpdatedData {
	@Autowired
	AlienRepo repo;
	
	public void updateData(int aid, String aname, String lang)
	{
		Optional<Alien> opt= repo.findById(aid);
		if(opt.isPresent())
		{
			Alien alien=opt.get();
			alien.setAname(aname);
			alien.setLang(lang);
			repo.save(alien);
		}
	}
}
