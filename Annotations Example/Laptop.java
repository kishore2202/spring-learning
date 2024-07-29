package com.sendMailToAnother;

import org.springframework.stereotype.Component;

@Component("lap1")
public class Laptop {
	
	private int age=15;
	private String name="Nobody";
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	
	public void com()
	{
		System.out.println(getName()+" "+getAge());
	}
}
