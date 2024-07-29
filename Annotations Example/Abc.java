package com.sendMailToAnother;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")
public class Abc {
	
	private int a;
	private int b;
	private String c;
	@Autowired
	Laptop lap1;
	
	public Abc()
	{
		System.out.println("Object created");
	}
	
	public int getA()
	{
		return a;
	}
	public void setA(int a)
	{
		this.a=a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public String getC() {
		return c;
	}
	public void setC(String c) {
		this.c = c;
	}

	public Laptop getLap1() {
		return lap1;
	}

	public void setLap1(Laptop lap1) {
		this.lap1 = lap1;
	}
	
	public void show()
	{
		System.out.println("Abc class method");
		lap1.com();
	}
}
