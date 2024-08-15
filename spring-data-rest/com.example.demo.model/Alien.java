package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue
	private int aid;
	private String aname;
	private String lang;
	
	public void setAid(int aid)
	{
		this.aid=aid;
	}
	public int getAid()
	{
		return aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getLang() {
		return lang;
	}
	public void setLang(String lang) {
		this.lang = lang;
	}
	public String toString()
	{
		return aid+" "+aname+" "+lang;
	}
}
