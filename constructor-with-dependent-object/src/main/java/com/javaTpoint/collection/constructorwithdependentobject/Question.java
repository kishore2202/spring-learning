package com.javaTpoint.collection.constructorwithdependentobject;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int id;
	private String name;
	private List<Answer> ans;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Answer> getAns() {
		return ans;
	}
	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}
	
	public Question(int id,String name,List<Answer> ans)
	{
		this.id=id;
		this.name=name;
		this.ans=ans;
	}
	
	public void display()
	{
		System.out.println(id+" " +name);
		Iterator<Answer> itr=ans.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
